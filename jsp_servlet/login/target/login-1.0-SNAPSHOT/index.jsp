<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <form action="login.jsp" method="POST">
        <fieldset style="width: fit-content">
            <legend>User Login</legend>
            Username: <input type="text" name="username" required>
            <br><br>
            Password: <input type="password" name="password" required>
            <br><br>
            <input type="submit" value="Login">
        </fieldset>
    </form>
</body>
</html>