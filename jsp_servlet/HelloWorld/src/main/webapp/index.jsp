<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 03/12/2021
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
    <a href="hello.html">Hello.html</a>
    <br>
    <%! String city = "Hanoi"; %>
    <%! int year = 2021; %>
    City : <b><%= city %></b>
    <br>
    Year : <u><%= year %></u>
    <br>
    <% out.print("Hello World !");  %>
    <br>
    <%
        for (int i=1; i<=10; i++) {
            if (i%2 == 0) {
                out.print(i + " ");
            }
        }
    %>
    <br>
    <%
        int a = 3, b = 5, c = 10, max;
        if (a>=b && a>=c) {
            max = a;
        } else if (b>=a && b>=c) {
            max = b;
        } else {
            max = c;
        }
        out.print("Max is " + c);
    %>
    <br>
    <h3 style="color: red;">Max is <i><%= c %></i></h3>
</body>
</html>
