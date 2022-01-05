<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
    <jsp:include page="navbar.jsp" />
    <div class="container mt-4 col-md-6">
        <h1 class="text text-primary text-center">Edit Employee</h1>
        <form:form method="POST" action="${pageContext.request.contextPath}/editsave">
             <table class="table table-bordered">
                <tr>
                    <td><form:hidden path="id"/></td>
                </tr>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td><form:label path="salary">Salary</form:label></td>
                    <td><form:input path="salary" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Save" />
                    </td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>

