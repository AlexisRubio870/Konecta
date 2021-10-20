<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Prueba Konecta</title>
    </head>

    <body>
        
        <div class="container mt-4">
            <a href="agregarSoli.htm">Agregar Solicitud</a>
            <table class="table table-dark table-striped">
                <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Código</th>
                        <th scope="col">Descripción</th>
                        <th scope="col">Resumen</th>
                        <th scope="col">Empleado</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="solicitud" items="${listaSolicitudes}">
                        <tr>
                            <td>${solicitud.id_solicitud}</td>
                            <td>${solicitud.codigo_Solicitud}</td>
                            <td>${solicitud.descripcion_Solicitud}</td>
                            <td>${solicitud.resumen_Solicitud}</td>
                            <td>${solicitud.empleado}</td>
                        </tr>
                    </c:forEach> 
                </tbody>
            </table>
        </div>
    </body>
</html>
