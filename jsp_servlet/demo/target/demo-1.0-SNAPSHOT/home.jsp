<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 14/12/2021
  Time: 9:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>This is homepage</h1>
    <h3>Company: ${c} </h3>
    <%
        int year = (int) request.getAttribute("y");
        out.print("Year: " + year);
    %>
    <br>
    <a href="hello">Hello Servlet</a>
    <a href="hello.jsp">Hello JSP</a>
</body>
</html>
