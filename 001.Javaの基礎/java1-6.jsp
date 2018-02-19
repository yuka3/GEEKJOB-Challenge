<%-- 
    Document   : java1-6
    Created on : 2018/02/19, 11:29:43
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
char moji = 'あ';

switch(moji){
    case 'a':
        out.println("英語");
        break;
    case 'あ':
        out.println("日本語");
        break;
    default:
        break;
}
%>

