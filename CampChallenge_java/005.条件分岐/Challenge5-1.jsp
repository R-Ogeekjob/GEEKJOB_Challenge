<%-- 
    Document   : newjsp
    Created on : 2018/06/07, 16:59:46
    Author     : 崚一
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Challenge5-1</title>
    </head>
    <body>
        <%
    int num = 2;
    if (num == 1) {
        out.print("１です！");
    } else if (num == 2) {
        out.print("プログラミングキャンプ！");
    } else {
        out.print("その他です！");
    }
    
        
        %>
    </body>
</html>
