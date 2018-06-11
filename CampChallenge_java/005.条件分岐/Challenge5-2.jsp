<%-- 
    Document   : Challenge5-2
    Created on : 2018/06/11, 11:17:06
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
            int num = 2;
            switch(num){
                case 1:
                    out.print("one");
                    break;
                case 2:
                    out.print("two");
                    break;
                default:
                    out.print("想定外");
                    
            }
            %>
    </body>
</html>
