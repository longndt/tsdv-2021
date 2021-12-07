<%@ page import="java.io.File" %>
<%@ page import="java.io.FileNotFoundException" %>
<%@ page import="java.util.Scanner" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: long
  Date: 07/12/2021
  Time: 11:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read from file</title>
</head>
<body>
    <%
        try {
            File file = new File("data123.txt");
            Scanner scan = new Scanner(file);
            ArrayList<String> content = new ArrayList<>();
            while (scan.hasNext()) {
                content.add(scan.nextLine());
            }
            for (String s : content) {
                out.print(s + "<br>");
            }

        } catch (FileNotFoundException e) {
            out.print("File not found");
        }
    %>
</body>
</html>
