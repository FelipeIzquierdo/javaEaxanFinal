<%-- 
    Document   : new_student
    Created on : 27/02/2016, 03:09:42 PM
    Author     : ESTUDIANTE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos de Usuario</h1>
        <form method="POST" action="StudentController">
            <label>Nombre</label><input type="text" name="studentName" value=""/>
            <label>Id</label><input type="text" name="id" value=""/>
            <label>Tel</label><input type="text" name="phone" value=""/>
            <label>Email</label><input type="email" name="email" value=""/>
            <label>Dir</label><input type="text" name="address" value=""/>
            <label>Ciudad</label><input type="text" name="city" value=""/>
            
            <input type="submit" value="Crear"/>
            
        </form>
        
    </body>
</html>
