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

            <dl class="dl-horizontal">
                <dt>Identificación:</dt> <dd>${requestScope.student.identification}</dd>
                <dt>Nombre:</dt> <dd>${requestScope.student.name}</dd>
                <dt>Tel:</dt> <dd>${requestScope.student.phone}</dd>
                <dt>Email:</dt> <dd>${requestScope.student.email}</dd>
                <dt>Ciudad</dt> <dd>${requestScope.student.addressVO.city}</dd>
                <dt>Calle</dt> <dd>${requestScope.student.addressVO.street}</dd>
                <dt>Programa</dt> <dd>${requestScope.student.programVO.name}</dd>
            </dl>
            
            <a class="btn btn-info" href="/finalExamPA2/StudentController">Ver Usuarios</a>
        </div>
    </body>
</html>
