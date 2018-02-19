<%-- 
    Document   : java1-8
    Created on : 2018/02/19, 13:35:51
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>

        
<%
 //インポートok
 
//配列の作成
ArrayList<String> datas = new ArrayList();{
    

//要素の追加
datas.add("10");
datas.add("100");
datas.add("soeda");
datas.add("hayasi");
datas.add("-20");
datas.add("118");
datas.add("END");
//soeda→33に更新

datas.set(2,"33");
      out.println("登録データ数" + datas.size());
    }
      out.println(datas);
%>

