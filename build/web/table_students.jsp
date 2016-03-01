<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : table_students
    Created on : 28/02/2016, 11:26:15 AM
    Author     : Felipe Iz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/finalExamPA2/css/bootstrap.min.css">
        <link rel="stylesheet" href="/finalExamPA2/css/style.css">
        <title>Ver Usuarios</title>
    </head>
    <body>
        <div class="col-sm-offset-1 col-sm-10 col-md-offset-2 col-md-8">
            <h1 class="title-page">Lista de Usuarios</h1>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Nombre</th>
                        <th>Dirección</th>
                        <th>ciudad</th>
                        <th>Email</th>
                        <th>Tel</th>
                    </tr>
                </thead>
                <c:forEach var="student" items="${students}"> 
                    <tbody>
                        <tr>
                            <td>${student.getId()}</td>
                            <td>${student.getStudentName()}</td>
                            <td>${student.getAddress()}</td>
                            <td>${student.getCity()}</td>
                            <td>${student.getEmail()}</td>
                            <td>${student.getPhone()}</td>
                        </tr>
                    </tbody>
                 </c:forEach>
            </table>
        </div>
        
    </body>
</html>
