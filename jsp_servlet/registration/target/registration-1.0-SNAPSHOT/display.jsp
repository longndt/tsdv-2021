<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 07/12/2021
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Information</title>
</head>
<body>

    <table border="1">
        <thead>
            <tr>
                <th>Full Name</th>
                <th>Mobile Number</th>
                <th>Birthday</th>
                <th>Gender</th>
                <th>Education</th>
                <th>Interests</th>
            </tr>
        </thead>
        <tbody>
           <tr>
               <td><%= request.getParameter("name")  %></td>
               <td><%= request.getParameter("mobile")  %></td>
               <td><%= request.getParameter("birthday")  %></td>
               <td><%= request.getParameter("gender")  %></td>
               <td><%= request.getParameter("education")  %></td>
               <td>
                   <%
                        String[] interests = request.getParameterValues("interests");
                        for (String i : interests) {
                            out.print(i + "<br>");
                        }
                   %>
               </td>
           </tr>
        </tbody>
    </table>
</body>
</html>
