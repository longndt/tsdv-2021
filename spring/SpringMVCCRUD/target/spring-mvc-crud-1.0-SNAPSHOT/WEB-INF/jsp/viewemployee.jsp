<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 22/11/2021
  Time: 9:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<html>
<head>
    <title>View Employee</title>
</head>
<body>
<jsp:include page="navbar.jsp" />
    <div class="container mt-4 col-md-6">
        <h1 class="text text-primary text-center mb-3">Employee List</h1>
        <table class="table table-bordered ">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Salary</th>
                <th>Menu</th>
            </tr>
            <c:forEach var="employee" items="${list}">
                <tr>
                    <td>${employee.id}</td>
                    <td>${employee.name}</td>
                    <td>${employee.salary} $ </td>
                    <td>
                        <a class="btn btn-warning" href="<%=request.getContextPath()%>/editemployee/${employee.id}">Edit</a>
                        <a class="btn btn-danger" href="<%=request.getContextPath()%>/deleteemployee/${employee.id}"
                           onclick="return confirm('Do you want to delete this employee ?')";
                        >Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>

