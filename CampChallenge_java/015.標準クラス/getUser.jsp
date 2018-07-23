<%-- 
    Document   : getjsp
    Created on : 2018/07/23, 13:10:42
    Author     : 崚一
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>getUser</title>
    </head>
    <body>
        <%
            // 受け取るパラメータの文字コード
            request.setCharacterEncoding("UTF-8");
            // テキストボックス(氏名)の情報
            out.print(request.getParameter("txtName"));
            // ラジオボタン(性別)の情報
            out.print(request.getParameter("male"));
            out.print(request.getParameter("female"));
            // テキストエリア(趣味)の情報
            out.print(request.getParameter("hobby"));
        %>
    </body>
</html>
