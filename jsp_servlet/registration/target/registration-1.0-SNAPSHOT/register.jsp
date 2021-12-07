<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Registration</title>
</head>
<body>
    <form action="savetobin.jsp" method="POST">
        <fieldset style="width: fit-content">
            <legend style="color: red">Customer Registration</legend>
            Full Name: <input type="text" name="name" required minlength="5" maxlength="30">
            <br><br>
            Mobile Number: <input type="number" name="mobile" required minlength="10" maxlength="10">
            <br><br>
            Birthday: <input type="date" name="birthday" required>
            <br><br>
            Gender:
            <input type="radio" name="gender" value="Male"> Male
            <input type="radio" name="gender" value="Female">Female
            <br><br>
            Education:
            <select name="education" required>
                <option value="Primary School">Primary School</option>
                <option value="Secondary School">Secondary School</option>
                <option value="High School">High School</option>
                <option value="College">College</option>
                <option value="University">University</option>
                <option value="Higher Education">Higher Education</option>
            </select>
            <br><br>
            Interests:
            <input type="checkbox" name="interests" value="Movies"> Movies
            <input type="checkbox" name="interests" value="Music"> Music
            <input type="checkbox" name="interests" value="Sports"> Sports
            <input type="checkbox" name="interests" value="Tourism"> Tourism
            <input type="checkbox" name="interests" value="Shopping"> Shopping
            <br><br>
            <input type="submit" value="Register">
        </fieldset>
    </form>
</body>
</html>