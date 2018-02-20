<%-- 
    Document   : java1-12
    Created on : 2018/02/20, 10:14:09
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int sum =0;
for(int i = 1; i<=100; i ++){
       sum +=i;
       
}

       out.print("100までの合計は"+sum+"です。");

%>

