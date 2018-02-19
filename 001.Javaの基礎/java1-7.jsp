<%-- 
    Document   : java1-7
    Created on : 2018/02/19, 11:44:47
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>

        
<%
 //インポート
 
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

      out.println("登録データ数" + datas.size());
    }
      out.println(datas);
%>


