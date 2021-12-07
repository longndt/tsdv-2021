<%@ page import="java.io.FileOutputStream" %>
<%@ page import="java.io.ObjectOutputStream" %>
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
    <title>Save to binary file</title>
</head>
<body>
<%
    try {
        String filename = "data.bin";
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ArrayList<String> data = new ArrayList<>();
        String name = request.getParameter("name");
        String mobile = request.getParameter("mobile");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String education = request.getParameter("education");
        String[] interests = request.getParameterValues("interests");
        data.add("Name: " + name);
        data.add("Mobile: " + mobile);
        data.add("Birthday: " + birthday);
        data.add("Gender: " + gender);
        data.add("Education: " + education);
        data.add("Interests: ");
        for (int i=0; i< interests.length; i++) {
            if (i == interests.length - 1) {
                data.add(interests[i]);
            } else {
                data.add(interests[i] + ", ");
            }
        }
        oos.writeObject(data);
        oos.close(); //remember to close ObjectOutputStream at the end
        fos.close();
        out.print("Save to file " + filename + " succeed !");
    } catch (FileNotFoundException e) {
        out.print("Save to file error !");
        //e.printStackTrace();
    }
%>
</body>
</html>
