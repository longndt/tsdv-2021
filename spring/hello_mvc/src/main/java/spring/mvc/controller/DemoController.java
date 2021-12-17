package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;

@Controller
public class DemoController {
    @RequestMapping(value = "/form")
    public String showForm() {
        return "form";
    }

    @RequestMapping(value = "/show")
    public String getForm(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        Calendar calendar = Calendar.getInstance();
        int yob = calendar.get(Calendar.YEAR) - age;
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("yob", yob);
        return "show";
    }
}
