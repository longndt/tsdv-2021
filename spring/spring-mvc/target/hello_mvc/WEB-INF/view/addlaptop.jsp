<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 04/01/2022
  Time: 10:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add laptop</title>
</head>
<body>
    <form action="savelaptop" method="post">
        <fieldset style="width: fit-content;">
            <legend>Add laptop</legend>
            Name: <input type="text" name="name" required><br><br>
            Brand: <input type="text" name="brand" required><br><br>
            Price: <input type="text" name="price" required><br><br>
            Color: <input type="text" name="color" required><br><br>
            Weight: <input type="text" name="weight" required><br><br>
            <input type="submit" value="Add">
        </fieldset>
    </form>
</body>
</html>
