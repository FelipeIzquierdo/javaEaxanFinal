<%-- 
    Document   : view_student
    Created on : 27/02/2016, 03:42:05 PM
    Author     : Felipe Iz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="student" scope="request" class="jspa.view.vo.StudentVOVw" />
        <label>Nombre:</label> <jsp:getProperty name="student" property="studentName" />
        <label>id:</label> <jsp:getProperty name="student" property="id" />
        <label>tel:</label> <jsp:getProperty name="student" property="phone" />
        <label>email:</label> <jsp:getProperty name="student" property="email" />
        <label>dir:</label> <jsp:getProperty name="student" property="address" />
        <label>ciudad:</label> <jsp:getProperty name="student" property="city" />
        <div>
            <form method="GET" action="StudentController">
                <input type="submit" value="Ver Estudiantes"/>
            </form>
        </div>
    
    </body>
</html>
