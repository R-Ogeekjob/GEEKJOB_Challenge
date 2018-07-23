<%-- 
    Document   : getDailyReport
    Created on : 2018/07/23, 14:30:31
    Author     : 崚一
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>getDailyReport</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            out.print(request.getParameter("txtName"));
            out.print(request.getParameter("todayTask"));
            out.print(request.getParameter("taskDelta"));
        %>    
    </body>
</html>
