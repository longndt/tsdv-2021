<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 13/12/2021
  Time: 9:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Management</title>
    <link rel="stylesheet" src="resources/css/bootstrap-min.css">
    <script src="resources/js/bootstrap/bootstrap.bundle.min.js"></script>
</head>
<body>
 <nav class="navbar navbar-inverse">
     <div class="container-fluid">
         <ul class="nav navbar-nav">
             <li><a href="<%=request.getContextPath()%>/viewemployee">VIEW EMPLOYEE</a></li>
             <li><a href="<%=request.getContextPath()%>/addemployee">ADD EMPLOYEE</a></li>
         </ul>
     </div>
 </nav>
</body>
</html>


