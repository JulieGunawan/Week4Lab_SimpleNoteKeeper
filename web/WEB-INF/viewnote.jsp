<%-- 
    Document   : viewnote
    Created on : Sep 29, 2020, 9:52:23 PM
    Author     : 751682
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>   
        <p> Title: ${note.title}<br> </p>
        <p> Content: <br> ${note.contents}<br></p>
            
       
       <a href="note?edit">Edit</a>
    </body>
</html>
