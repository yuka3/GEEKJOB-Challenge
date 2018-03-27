<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date, javax.servlet.http.Cookie" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            //cookieの記録と表示
        
                Cookie[] coo = request.getCookies();
                    if(coo != null){
                        for(int i = 0;i <coo.length; i++){
                            if(coo[i].getName().equals("lastLogin")){
                            out.print("LastLoginは" + coo[i].getValue());
                            break;
                            }
                        } 
                    }
                Date lastLogin = new Date();
                Cookie coo2 = new Cookie("lastLogin", lastLogin.toString());
                response.addCookie(coo2);
        %>
        
    </body>
</html>
