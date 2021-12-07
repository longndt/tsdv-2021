<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 07/12/2021
  Time: 9:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login check</title>
</head>
<body>
    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");
       if (username.equals("admin") && password.equals("123456")) {
           out.print("Login succeed !");
       } else {
           out.print("Login failed !");
       }
    %>
</body>
</html>
