/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author 751682
 */
public class Note implements Serializable {
 
    private String title;
    private String contents;
    
    public Note(){
        this.title="";
        this.contents="";
    }
    
    public Note(String title, String contents){
        this.title = title;
        this.contents=contents;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getContents(){
        return this.contents;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public void setContents(String contents){
        this.contents=contents;
    }
}
