<%-- 
    Document   : update_student
    Created on : 8/03/2016, 08:21:58 PM
    Author     : Felipe Iz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/JSPLap/css/bootstrap.min.css">
        <link rel="stylesheet" href="/JSPLap/css/style.css">
        <title>Crear nuevo Usuario</title>
    </head>
    <body>
        <div class="col-sm-offset-1 col-sm-10 col-md-offset-2 col-md-8">
            <h1 class="title-page">Datos de Usuario</h1>
            <form method="POST" action="StudentController" class="form-horizontal">
                <div class="form-group">
                    <label class="col-sm-2 control-label">Identificación</label>
                    <div class="col-sm-10">
                        <input class="form-control" type="text" name="identification" value="${requestScope.student.identification}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Nombre</label>
                    <div class="col-sm-10">
                        <input class="form-control" type="text" name="studentName" value="${requestScope.student.name}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Teléfono</label>
                    <div class="col-sm-10">
                        <input class="form-control" type="text" name="phone" value="${requestScope.student.phone}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Email</label>
                    <div class="col-sm-10">
                        <input class="form-control" type="email" name="email" value="${requestScope.student.email}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Dirección</label>
                    <div class="col-sm-10">
                        <input class="form-control" type="text" name="street" value="${requestScope.student.addressVO.street}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Ciudad</label>
                    <div class="col-sm-10">
                        <input class="form-control" type="text" name="city" value="${requestScope.student.addressVO.city}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Programa</label>
                    <div class="col-sm-10">
                        <input class="form-control" type="text" name="programName" value="${requestScope.student.programVO.name}"/>
                    </div>
                </div>
                <input type="hidden" name="id" value="${requestScope.student.id}">
                <input type="hidden" name="funcion" value="6">
                <input type="submit" class="btn btn-info col-sm-offset-2" value="Crear Estudiente"/>
            </form>
        </div> 
    </body>
</html>
