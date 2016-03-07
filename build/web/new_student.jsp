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
        <link rel="stylesheet" href="/finalExamPA2/css/bootstrap.min.css">
        <link rel="stylesheet" href="/finalExamPA2/css/style.css">
        <title>Crear nuevo Usuario</title>
    </head>
    <body>
        <div class="col-sm-offset-1 col-sm-10 col-md-offset-2 col-md-8">
            <h1 class="title-page">Datos de Usuario</h1>
            <form method="POST" action="StudentController" class="form-horizontal">
                <div class="form-group">
                    <label class="col-sm-2 control-label">Identificación</label>
                    <div class="col-sm-10">
                        <input class="form-control" type="text" name="id" value=""/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Nombre</label>
                    <div class="col-sm-10">
                        <input class="form-control" type="text" name="studentName" value=""/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Teléfono</label>
                    <div class="col-sm-10">
                        <input class="form-control" type="text" name="phone" value=""/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Email</label>
                    <div class="col-sm-10">
                        <input class="form-control" type="email" name="email" value=""/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Dirección</label>
                    <div class="col-sm-10">
                        <input class="form-control" type="text" name="street" value=""/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Ciudad</label>
                    <div class="col-sm-10">
                        <input class="form-control" type="text" name="city" value=""/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Programa</label>
                    <div class="col-sm-10">
                        <input class="form-control" type="text" name="programName" value=""/>
                    </div>
                </div>
                <input type="submit" class="btn btn-info col-sm-offset-2" value="Crear Usuario"/>
            </form>
        </div> 
    </body>
</html>
