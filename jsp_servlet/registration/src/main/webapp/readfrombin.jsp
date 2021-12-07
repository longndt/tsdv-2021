<%@ page import="java.io.File" %>
<%@ page import="java.io.FileInputStream" %>
<%@ page import="java.io.ObjectInputStream" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: long
  Date: 07/12/2021
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read From Binary File</title>
</head>
<body>
    <%
        try {
            File file = new File("data.bin");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<String>  content = (ArrayList<String>) ois.readObject();
            for (String s : content) {
                out.print(s + "<br>");
            }
        } catch (Exception e) {
            out.print("error");
            e.printStackTrace(); //print detail error
        }
    %>
</body>
</html>
