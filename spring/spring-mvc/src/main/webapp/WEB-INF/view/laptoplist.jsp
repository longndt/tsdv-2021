<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 04/01/2022
  Time: 10:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Laptop List</title>
</head>
<body>
<% int i = 1; %>
    <h3><a href="addlaptop"> Add laptop </a></h3>
    <table border="1">
        <tr>
            <th>No.</th>
            <th>Name</th>
            <th>Brand</th>
            <th>Price</th>
            <th>Color</th>
            <th>Weight</th>
            <th>Action</th>
        </tr>
        <c:forEach var="laptop" items="${laptops}">
            <tr>
                <td><%= i %></td>
                <td><c:out value="${laptop.name}" /></td>
                <td><c:out value="${laptop.brand}" /></td>
                <td><c:out value="${laptop.price}" /> $</td>
                <td><c:out value="${laptop.color}" /></td>
                <td><c:out value="${laptop.weight}" /> kg</td>
                <td>
                    <a href="deletelaptop/<%= i-1 %>"
                    onclick="return confirm('Do you want to delete this laptop ?');"
                    >Delete</a>
                </td>
            </tr>
            <% i++; %>
        </c:forEach>
    </table>
</body>
</html>
