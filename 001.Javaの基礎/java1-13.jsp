<%-- 
    Document   : java1-13
    Created on : 2018/02/20, 10:31:16
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

int num =1000;
int time = 0;
while(num>=100){
    time--;
    num=num/2;

}

out.print(num);


%>

