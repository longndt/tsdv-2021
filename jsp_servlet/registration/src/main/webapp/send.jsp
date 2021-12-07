<%@ page import="javax.swing.*" %><%--
  Created by IntelliJ IDEA.
  User: long
  Date: 07/12/2021
  Time: 12:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Send data</title>
</head>
<body>
<%
    String company = "Toshiba Software Development Company";
    double salary = 2500.50;
    session.setAttribute("company",company);
    session.setAttribute("salary", salary);
    response.sendRedirect("receive.jsp");
%>>
</body>
</html>
