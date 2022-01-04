<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 22/11/2021
  Time: 9:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix=""%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Employee</title>
</head>
<body>
    <h1>Edit employee</h1>
    <form:form method="POST" action="save">
        <table>
            <tr>
                <td>Id: </td>
                <td><form:hidden path="id" /></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Salary: </td>
                <td><form:input path="salary" /></td>
            </tr>
            <td> </td>
            <td>
                <input type="submit" value="Edit Save" />
            </td>
        </table>
    </form:form>
</body>
</html>

