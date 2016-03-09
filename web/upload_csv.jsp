<%-- 
    Document   : upload_csv
    Created on : 8/03/2016, 10:16:46 PM
    Author     : Felipe Iz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/JSPLap/css/bootstrap.min.css">
        <link rel="stylesheet" href="/JSPLap/css/style.css">
        <title>Cargar Estudiante</title>
    </head>
    <body>
        <div class="col-sm-offset-1 col-sm-10 col-md-offset-2 col-md-8">
            <h1 class="title-page">Cargar estudiantes por CSV</h1>            
 
            <form method="POST" action="StudentController" class="form-horizontal">
                <div class="form-group">
                    <label class="col-sm-2 control-label">Fichero</label>
                    <div class="col-sm-10">
                        <input type=file name=path>
                    </div>
                </div>                
                <input type="hidden" name="funcion" value="7">
                <input type="submit" class="btn btn-info col-sm-offset-2" value="Cargar Estudiantes"/>
            </form>
        </div> 
    </body>
</html>
