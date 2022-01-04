<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 04/01/2022
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Get Laptop List</title>
</head>
<body>
<% int i = 1; %>
    <table border="1">
        <tr>
            <th>No.</th>
            <th>Laptop</th>
        </tr>
        <c:forEach var="laptop" items="${laptops}">
            <tr>
                    <td><%= i %></td>
                    <td><c:out value="${laptop}" /> </td>
                    <% i++; %>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
