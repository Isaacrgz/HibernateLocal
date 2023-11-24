<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Personas</title>
    </head>
    <body>
        <table border="1">
            <caption>Listado de personas</caption>
            <tr>
                <th>Id Persona</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                <th>Teléfono</th>
            </tr>
            <c:forEach var="person" items="${people}">
                <tr>
                    <td>${person.idPerson}</td>
                    <td>${person.name}</td>
                    <td>${person.lastname}</td>
                    <td>${person.email}</td>
                    <td>${person.phone}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
