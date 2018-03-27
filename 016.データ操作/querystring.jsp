
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--入力された値によって幼児内容を変えるクエリストリング-->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>クエリストリング表示 Page</title>
    </head>
    <body>
        <%
        request.setCharacterEncoding("UTF-8");
        int total = Integer.valueOf(request.getParameter("total"));
        String a = request.getParameter("type");
        int count = Integer.valueOf(request.getParameter("count"));
        
        out.println("総額は"+total+"円です<br>");
        
        if(a.equals("1")){
        out.println("「雑貨」<br>");
        }else if(a.equals("2")){
        out.println("「生鮮食品」<br>");
        }else if(a.equals("3")){
        out.println("「その他」<br>");
        }else{
        out.println("1から3の数字を入力して下さい。");

        }
        
        out.println("個数："+count+"個<br>");
        
        
        out.println("1個当たりの価格"+ count +"円");
        
        //3000未満0％
        //3000以上5000未満は4％
        //5000以上5％
        if(total >= 3000 && total < 5000){  
        double point = total*0.04;
        out.println("ポイントは"+ point +"ポイントです。");
        }else if(total > 5000){
        double point = total*0.05;
        out.println("ポイントは"+ point +"ポイントです。");
        }
       
%>
    </body>
</html>