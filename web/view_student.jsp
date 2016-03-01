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
        <link rel="stylesheet" href="/finalExamPA2/css/bootstrap.min.css">
        <link rel="stylesheet" href="/finalExamPA2/css/style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="col-sm-offset-1 col-sm-10 col-md-offset-2 col-md-8">
            <h1 class="title-page">Usuario Registrado</h1>
            <jsp:useBean id="student" scope="request" class="jspa.view.vo.StudentVOVw" />
            <dl class="dl-horizontal">
                <dt>Nombre:</dt> <dd><jsp:getProperty name="student" property="studentName" /></dd>
                <dt>id:</dt> <dd><jsp:getProperty name="student" property="id" /></dd>
                <dt>tel:</dt> <dd><jsp:getProperty name="student" property="phone" /></dd>
                <dt>email:</dt> <dd><jsp:getProperty name="student" property="email" /></dd>
                <dt>dir:</dt> <dd><jsp:getProperty name="student" property="address" /></dd>
                <dt>ciudad:</dt> <dd><jsp:getProperty name="student" property="city" /></dd>
            </dl>
            
            <a class="btn btn-info" href="/finalExamPA2/StudentController">Ver Usuarios</a>
        </div>
    </body>
</html>
