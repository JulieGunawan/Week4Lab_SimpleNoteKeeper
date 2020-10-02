<%-- 
    Document   : editnote
    Created on : Sep 29, 2020, 9:55:48 PM
    Author     : 751682
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form action="note" method="post">
          Title:   <input type="text" name="title" value="${note.title}"> <br>
          Contents: <textarea name="contents" rows="10" cols="70" wrap="hard">${note.contents}
        </textarea>
        
        <br>
        <input type="Submit" value="Save">      
            
            
        </form>
        
        
       
    </body>
</html>
