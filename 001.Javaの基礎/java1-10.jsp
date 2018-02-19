<%-- 
    Document   : java1-10
    Created on : 2018/02/19, 15:24:01
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
//初期化
long  answer =1;
    
    
//8の20乗を計算
for(long i=0; i<20; i++){
    answer = answer * 8;
}

//表示

out.print(answer);

%>
