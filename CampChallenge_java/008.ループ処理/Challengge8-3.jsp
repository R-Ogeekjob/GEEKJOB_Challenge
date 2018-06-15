<%-- 
    Document   : Challengge8-3
    Created on : 2018/06/15, 11:22:56
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
            int num = 0;
            for(int i=1; i<=100; i++){
                num = num + i;
            }
            out.print(num);
            %>
    </body>
</html>
