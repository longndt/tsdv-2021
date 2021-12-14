<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 14/12/2021
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="ServletLogin" method="GET">
        <fieldset style="width: fit-content;">
            <legend>UserLogin</legend>
            Username: <input type="text" name="username" required><br><br>
            Password: <input type="password" name="password" required><br><br>
            <input type="submit" value="Login">
        </fieldset>
    </form>
</body>
</html>
