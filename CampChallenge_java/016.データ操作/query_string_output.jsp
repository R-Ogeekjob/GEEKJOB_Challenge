<%-- 
    Document   : query_string_output
    Created on : 2018/07/23, 15:40:21
    Author     : 崚一
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%--
▼処理内容
1.total,count,type の値を取得し，値が画面に表示される
　※typeは数字ではなく，対応する商品種別が表示される様にしましょう
　
2.商品の単価が画面に表示される

3.商品購入総額に応じてポイントを計算し，その値が画面に表示される
　※ポイントは商品購入総額を基準にして，以下の様に算出する 
　　3000 円未満 ... 0% 
　　3000 円以上で5000円未満 ... 購入総額の 4% 
　　5000 円以上 ... 購入総額の 5%
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>クエストリングを取得</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            String goods = request.getParameter("type");
            String count = request.getParameter("数量");
            String total = request.getParameter("総額");
            
            // 総額表示
            out.print("総額" + total + "円<br>");
            
            // 数量表示
            out.print("数量" + count + "個<br>");
            
            // 商品表示
            out.print("商品：");
            if(goods.equals("1")){
                out.print("雑貨<br>");
            }
            if(goods.equals("2")){
                out.print("生鮮食品<br>");
            }
            if(goods.equals("3")){
                out.print("その他<br>");
            }
            
            // 単価表示
            int t = Integer.parseInt(total);
            int c = Integer.parseInt(count);
            
            out.print("単価" + t/c + "円");
            

            //購入額に応じてポイント表示
            if(t < 3000){
                out.print("付与ポイントは0ポイントです");
            }else if(3000 < t && t < 5000){
                out.print("付与ポイントは購入総額の4%の" + t * 0.04 +"ポイントです");
            }else if(5000 < t){
                out.print("付与ポイントは購入総額の5%の" + t * 0.05 +"ポイントです");
            }
        %>
    </body>
</html>
