<%-- 
    Document   : java1-9
    Created on : 2018/02/19, 13:53:02
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import = "java.util.HashMap" %>
<%
 //インポートok
 HashMap<String,String>prof = 
         new HashMap<String,String>();    

//データを格納
prof.put("1","AAA<br>");
prof.put("hello","world<br>");
prof.put("soeda","33<br>");
prof.put("20","20<br>");

//値の取得

out.print("1:"+prof.get("1"));
out.print("hello:"+prof.get("hello"));
out.print("soeda:"+prof.get("soeda"));
out.print("20:"+prof.get("20"));

%>
