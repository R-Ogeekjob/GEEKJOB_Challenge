<%-- 
    Document   : query_string_input
    Created on : 2018/07/23, 15:39:29
    Author     : 崚一
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>query_string_input</title>
    </head>
    <body>
        <form action="./query_string_output.jsp" method="get">
            <label>商品種別</label>
            <select name="type"
                    <option value="1">雑貨</option>
                    <option value="2">生鮮食品</option>
                    <option value="3">その他</option></select>
            
            <label>数量</label>
            <input type="number" name="数量">
            
            <label>総額</label>
            <input type="number" name="総額">
            
            <input type="submit" name="submit">
            
        </form>
    </body>
</html>
