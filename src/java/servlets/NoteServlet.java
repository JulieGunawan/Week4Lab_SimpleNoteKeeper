/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 751682
 */
public class NoteServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path=getServletContext().getRealPath("/WEB-INF/note.txt");
        
        //reading file
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String title = br.readLine();
        String contents = "";
       
        String next=br.readLine();
        while (next!=null){
            contents += next;           
            next=br.readLine();
        }
        
        contents = contents.replaceAll("(\r\n|\n)","<br>");
        
        Note note = new Note(title,contents);
        request.setAttribute("note", note);
        
        br.close();
        
        String editNote = request.getParameter("edit");
        
        if (editNote !=null) {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                    .forward(request, response);
        }
        else
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                    .forward(request, response);
    }
    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        //false indicated that FileWriter will not append anything to text file
        BufferedWriter bw = new BufferedWriter(new FileWriter(path, false));
        PrintWriter pw = new PrintWriter(bw);
        
        String title = request.getParameter("title");
        String contents = request.getParameter("contents");
        
        pw.println(title);
        pw.println(contents);
       
        
        Note note = new Note(title, contents);
        request.setAttribute("note", note);
        
        pw.close();
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
        
    } 
}