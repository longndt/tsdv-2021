<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 14/12/2021
  Time: 9:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login check</title>
</head>
<body>
    <%
        boolean login = (boolean) request.getAttribute("login");
        if (login == true) {
            out.print("Login succeed !");
        } else {
            out.print("Login failed !");
        }
        String name = (String) request.getAttribute("name");
        session.setAttribute("name", name);
    %>
    <a href="admin.jsp">Admin page</a>
</body>
</html>
