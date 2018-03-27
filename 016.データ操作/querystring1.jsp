<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./querystring.jsp" method="get">
            総額：<input type="text" name="total">
            商品種別番号：<input type="text" name="type">
            個数：<input type="text" name="count">
             <input type="submit" name="btnSubmit">
         </form>
    </body>
</html>