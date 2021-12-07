<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.io.FileNotFoundException" %><%--
  Created by IntelliJ IDEA.
  User: long
  Date: 07/12/2021
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Save to text file</title>
</head>
<body>
<%
    try {
        String filename = "data.txt";
        PrintWriter pw = new PrintWriter(filename);
        String name = request.getParameter("name");
        String mobile = request.getParameter("mobile");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String education = request.getParameter("education");
        String[] interests = request.getParameterValues("interests");
        pw.println("Name: " + name);
        pw.println("Mobile: " + mobile);
        pw.println("Birthday: " + birthday);
        pw.println("Gender: " + gender);
        pw.println("Education: " + education);
        pw.print("Interests: ");
        for (int i=0; i< interests.length; i++) {
            if (i == interests.length - 1) {
                pw.print(interests[i]);
            } else {
                pw.print(interests[i] + ", ");
            }
        }
        pw.close();
        out.print("Save to file " + filename + " succeed !");
    } catch (FileNotFoundException e) {
        out.print("Save to file error !");
        //e.printStackTrace();
    }
%>
</body>
</html>
