<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<<<<<<< HEAD
    <jsp:include page="header.jsp" />
=======
    <jsp:include page="navbar.jsp" />
>>>>>>> 02db3cd55974a228d19f3ee016c870d45054fceb
    <div class="container mt-4 col-md-6">
        <h1 class="text text-primary text-center">Add Employee</h1>
        <form:form method="POST" action="addsave">
            <table class="table table-bordered">
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
                        <input type="submit" value="Add" />
                    </td>
                </tr>
            </table>
        </form:form>
    </div>
<<<<<<< HEAD
    <jsp:include page="footer.jsp" />
=======
>>>>>>> 02db3cd55974a228d19f3ee016c870d45054fceb
</body>
</html>


