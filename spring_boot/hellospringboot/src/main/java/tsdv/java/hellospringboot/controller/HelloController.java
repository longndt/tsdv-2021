package tsdv.java.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(Model model) {
        String capital = "Hanoi";
        String country = "Vietnam";
        model.addAttribute("capital", capital);
        model.addAttribute("country", country);
        return "index";
    }
}
