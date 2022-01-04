<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix=""%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Form</title>
</head>
<body>
    <h1>Add new employee</h1>
    <form:form method="POST" action="save">
        <table>
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
                <input type="submit" value="Save" />
            </td>
        </table>
    </form:form>
</body>
</html>


