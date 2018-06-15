<%-- 
    Document   : Challenge8-2
    Created on : 2018/06/15, 10:36:55
    Author     : 崚一
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String type = "A";
            for(int i=1; i<=30; i++){
                type=type+"A";
            }
            out.print(type);
        %>
    </body>
</html>
