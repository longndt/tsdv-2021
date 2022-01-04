<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Employee Form</title>
</head>
<body>
<jsp:include page="navbar.jsp" />
<div class="container mt-4 col-md-6">
    <h1 class="text text-primary text-center">Add Employee</h1>
    <form:form method="POST" action="save">
        <table class="table table-bordered">
            <tr>
                <td><form:label path="name">Name</form:label></td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td><form:label path="salary">Salary</form:label></td>
                <td><form:input path="salary" /></td>
            </tr>
            <td>
            <td colspan="2">
                <input type="submit" value="Add" />
            </td>
            </td>
        </table>
    </form:form>
</div>
</body>
</html>


