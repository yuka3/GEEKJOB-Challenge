<%-- 
    Document   : java1-2
    Created on : 2018/02/19, 10:39:45
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
//定数と変数の宣言

final int BESE=200;
int num = 10;

// 引き算
out.println(BESE - num);
// 足し算
out.println( BESE + num);
// 掛け算
out.println( BESE* num);
// 割り算
out.println( BESE / num);
// 余り
out.println( BESE % num);




%>
