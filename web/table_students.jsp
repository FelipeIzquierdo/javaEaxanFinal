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
        <title>JSP Page</title>
    </head>
    <body>
    <c:forEach var="student" items="students">
        <table border="1">
            <thead>
                <tr>
                    <th>id:</th>
                    <th>Nombre:</th>
                    <th>dir:</th>
                    <th>ciudad:</th>
                    <th>email:</th>
                    <th>tel:</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><jsp:getProperty name="student" property="id" /></td>
                    <td><jsp:getProperty name="student" property="studentName" /></td>
                    <td><jsp:getProperty name="student" property="address" /></td>
                    <td><jsp:getProperty name="student" property="city" /></td>
                    <td><jsp:getProperty name="student" property="email" /></td>
                    <td><jsp:getProperty name="student" property="phone" /></td>
                </tr>
            </tbody>
        </table>

    </c:forEach>
        <h1>Hello World!</h1>
    </body>
</html>
