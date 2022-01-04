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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
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


