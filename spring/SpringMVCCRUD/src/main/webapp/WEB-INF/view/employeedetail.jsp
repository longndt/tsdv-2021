<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 07/01/2022
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Management</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">    <script src="resources/js/bootstrap/bootstrap.bundle.min.js"></script>
</head>
<body>
<jsp:include page="navbar.jsp" />
<div class="container-md col-5">
    <table>
        <tr>
            <td>
                <img src="${employee.image}" width="300px" height="400px">
            </td>
            <td>
                <h1>Name: ${employee.name}</h1>
                <h1>Mobile: ${employee.mobile}</h1>
                <h1>Address: ${employee.address}</h1>
                <h1>Email: ${employee.email}</h1>
                <h1>Salary: ${employee.salary}</h1>
            </td>
        </tr>
    </table>
</div>

</body>
</html>
