<%-- 
    Document   : Challenge6-1
    Created on : 2018/06/11, 14:08:13
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
          String[] datas = {"10","100","soeda","hayashi","-20","118","END"};
                        
            datas[2] = "33";
            
            out.print(datas[0]);
            out.print(datas[1]);
            out.print(datas[2]);
            out.print(datas[3]);
            out.print(datas[4]);
            out.print(datas[5]);
            out.print(datas[6]);
            

            %>
    </body>
</html>
