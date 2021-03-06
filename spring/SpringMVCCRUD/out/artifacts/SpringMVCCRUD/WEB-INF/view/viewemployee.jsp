<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 22/11/2021
  Time: 9:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Management</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">    <script src="resources/js/bootstrap/bootstrap.bundle.min.js"></script>
</head>
<body>
    <jsp:include page="navbar.jsp" />
    <div class="container mt-4 col-md-6">
        <h1 class="text text-primary text-center mb-3">Employee List</h1>
        <form action="searchbyname" method="POST">
            <input type="search" name="name" placeholder="Enter name to search">
        </form>
        <table class="table table-bordered ">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Image</th>
                <th>Salary
                <a href="sortbysalaryasc" style="text-decoration: none">
                    <img src="resources/images/up.jpg" width="20px" height="20px">
                </a>
                <a href="sortbysalarydesc" style="text-decoration: none">
                    <img src="resources/images/down.jpg" width="20px" height="20px">
                </a>
                </th>
                <th>Menu</th>
            </tr>
            <c:forEach var="employee" items="${list}">
                <tr>
                    <td>${employee.id}</td>
                    <td>${employee.name}</td>
                    <td>
                        <a href="viewemployee/${employee.id}">
                            <img src="${employee.image}" width="150px" height="200px">
                        </a>
                    </td>
                    <td>${employee.salary} $ </td>
                    <td>
                        <a class="btn btn-warning" href="editemployee/${employee.id}">Edit</a>
                        <a class="btn btn-danger" href="deleteemployee/${employee.id}"
                           onclick="return confirm('Do you want to delete this employee ?')";
                        >Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <jsp:include page="footer.jsp" />
</body>
</html>

