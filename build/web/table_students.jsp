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
        <link rel="stylesheet" href="/JSPLap/css/bootstrap.min.css">
        <link rel="stylesheet" href="/JSPLap/css/style.css">
        <title>Ver Estudientes</title>
    </head>
    <body>
        <div class="col-sm-offset-1 col-sm-10 col-md-offset-2 col-md-8">
            <h1 class="title-page">Lista de Estudientes</h1>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Identificación</th>
                        <th>Nombre</th>
                        <th>Email</th>
                        <th>Tel</th>
                        <th>Dirección</th>
                        <th>ciudad</th>
                        <th>Programa</th>
                        
                    </tr>
                </thead>
                <c:forEach var="student" items="${students}"> 
                    <tbody>
                        <tr>
                            <td>${student.getId()}</td>
                            <td>${student.getIdentification()}</td>
                            <td>${student.getName()}</td>
                            <td>${student.getEmail()}</td>
                            <td>${student.getPhone()}</td>
                            <td>${student.getAddressVO().getStreet()}</td>
                            <td>${student.getAddressVO().getCity()}</td>
                            <td>${student.getProgramVO().getName()}</td>
                            
                        </tr>
                    </tbody>
                 </c:forEach>
            </table>
        </div>
        
    </body>
</html>
