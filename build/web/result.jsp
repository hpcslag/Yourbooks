<%-- 
    Document   : result.jsp
    Created on : 2 juil. 2015, 11:58:47
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>You Select color: <% String c = (String)request.getAttribute("color"); out.print(c); %></h1>
    </body>
</html>
