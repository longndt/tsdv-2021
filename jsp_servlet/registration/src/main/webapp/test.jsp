<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 07/12/2021
  Time: 12:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
<%
    String company = (String) session.getAttribute("company");
    double salary = (double) session.getAttribute("salary");
    out.print("COMPANY: " + company + "<br>");
    out.print("SALARY: " + salary + " $");
%>
</body>
</html>
