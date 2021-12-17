<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 17/12/2021
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Hello Spring</title>
</head>
<body>
    <h2>Hello ${name} </h2>
    <h3>Welcome ${year} </h3>
    <a href="<%= request.getContextPath()%>/">Homepage</a>
</body>
</html>
