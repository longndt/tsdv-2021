package tsdv.demo.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCheck", value = "/ServletCheck")
public class ServletCheck extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter pw = response.getWriter();
        String name = request.getParameter("username");
        int password = Integer.parseInt(request.getParameter("password"));
        boolean check;
        if (name.equals("admin") && password == 123456) {
//            pw.println("Login succeed !");
            check = true;
        } else {
//            pw.println("Login failed !");
            check = false;
        }
        request.setAttribute("login", check);
        request.setAttribute("name", name);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("check.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
