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
        <h1 class="text text-primary text-center">Edit Employee</h1>
        <form:form method="POST" action="editsave">
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
                     <td><form:label path="mobile">Mobile</form:label></td>
                     <td><form:input path="mobile" /></td>
                 </tr>
                 <tr>
                     <td><form:label path="address">Address</form:label></td>
                     <td><form:input path="address" /></td>
                 </tr>
                 <tr>
                     <td><form:label path="email">Email</form:label></td>
                     <td><form:input path="email" /></td>
                 </tr>
                 <tr>
                     <td><form:label path="image">Image</form:label></td>
                     <td><form:input path="image" /></td>
                 </tr>
                 <tr>
                     <td colspan="2">
                         <input type="submit" value="Edit" />
                     </td>
                 </tr>
            </table>
        </form:form>
    </div>
    <jsp:include page="footer.jsp" />
</body>
</html>

