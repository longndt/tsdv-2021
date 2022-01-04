<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 17/12/2021
  Time: 11:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Mobile List</title>
</head>
<body>
<table>
    <thead>
        <tr>
            <th>Mobiles</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="m" items="${mobiles}">
        <tr>
            <td>
                ${m}
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
