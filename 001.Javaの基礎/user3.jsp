<%-- 
    Document   : user3
    Created on : 2018/02/28, 11:16:06
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
// 受け取るパラメータの文字コード
request.setCharacterEncoding("UTF-8");
// テキストボックスの情報
out.print(request.getParameter("名前"));
// ラジオボタンの情報
out.print(request.getParameter("性別"));
// テキストエリア
out.print(request.getParameter("趣味"));



%>