<%-- 
    Document   : find_student_byprogram
    Created on : 8/03/2016, 07:26:22 PM
    Author     : Felipe Iz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/JSPLap/css/bootstrap.min.css">
        <link rel="stylesheet" href="/JSPLap/css/style.css">
        <title>Buscar estudiante por Id del programa</title>
    </head>
    <body>
        <div class="col-sm-offset-1 col-sm-10 col-md-offset-2 col-md-8">
            <h1 class="title-page">Buscar estudiante por Id del programa</h1>
            <form method="POST" action="StudentController" class="form-horizontal">
                <div class="form-group">
                    <label class="col-sm-2 control-label">Id programa</label>
                    <div class="col-sm-10">
                        <input class="form-control" type="text" name="id" value=""/>
                    </div>
                </div>                
                <input type="hidden" name="funcion" value="4">
                <input type="submit" class="btn btn-info col-sm-offset-2" value="Buscar Usuario"/>
            </form>
        </div> 
    </body>
</html>
