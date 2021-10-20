<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Prueba Konecta</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header big-info">
                    <h3>Agregar Solicitud</h3>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>ID</label>
                        <input type="number" name="id_solicitud" class="form-control">
                        <label>Código</label>
                        <input type="number" name="codigo_Solicitud" class="form-control">
                        <label>Descripción</label>
                        <input type="text" name="descripcion_Solicitud" class="form-control">
                        <label>Resumen</label>
                        <input type="text" name="resumen_Solicitud" class="form-control">
                        <input type="submit" value="Agregar" class="btn btn-success">
                        <a href="indexSolicitudes.htm">Volver</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
