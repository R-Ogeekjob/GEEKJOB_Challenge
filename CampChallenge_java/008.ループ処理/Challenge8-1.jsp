<%-- 
    Document   : Challenge8-1
    Created on : 2018/06/11, 16:21:20
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
            //8の20乗を計算したい
            long result = 1;
            for (int i=1;i<=20;i++) {
                result *= 8;
            }
            
            out.print(result);
            
            //回数把握のための変数：i=1
            //繰り返す回数：i<=20 (20回)
            //1回毎の増減：i++
            
            %>
    </body>
</html>
