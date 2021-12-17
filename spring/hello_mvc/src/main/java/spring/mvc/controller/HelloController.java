package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class HelloController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";  //render ra file view index.jsp
    }
    @RequestMapping(value = "/hello")
    public String hello(Model model) {
        String name = "Toshiba";
        int year = 2022;
        model.addAttribute("name", name);
        model.addAttribute("year", year);
        return "hello";
    }
    @RequestMapping(value = "/mobile")
    public String mobile(Model model) {
        ArrayList<String> mobiles = new ArrayList<>();
        mobiles.add("iPhone");
        mobiles.add("Samsung");
        mobiles.add("Sony");
        mobiles.add("HTC");
        model.addAttribute("mobiles", mobiles);
        return "mobile";
    }
}
