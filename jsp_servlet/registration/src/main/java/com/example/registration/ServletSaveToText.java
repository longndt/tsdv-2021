package com.example.registration;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/savetotxt")
public class ServletSaveToText extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h3>Save to file " + "<i>" + filename + "</i>" + " succeed !</h3>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
