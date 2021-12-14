<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 14/12/2021
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Info</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    out.print("Username: " + username + "<br>");
    out.print("Password: " + password);
%>
</body>
</html>
