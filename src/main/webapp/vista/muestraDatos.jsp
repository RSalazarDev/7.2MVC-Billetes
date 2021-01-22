<%-- 
    Document   : muestraDatos
    Created on : Jan 22, 2021, 9:29:26 PM
    Author     : salaz
--%>

<%@page import="modelo.Billete"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Muestra Datos</h1>
        <% Billete imp = (Billete) request.getAttribute("calcula");%>
        <h1>Datos de la reserva</h1>
        <h2>Fecha vuelo: <%=imp.getFechaIni()%></h2>
        <h2>Importe total: <%=imp.importe()%></h2>
        <h2>Mes: <%=imp.getMes()%></h2>
    </body>
</html>
