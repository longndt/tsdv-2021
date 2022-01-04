package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NewController {
    @RequestMapping("/newyear")
    public String showNewYear(Model model) {
        int year = 2022;
        String animal = "Tiger";
        model.addAttribute("year", year);
        model.addAttribute("animal",animal);
        return "newyear";
    }

    @RequestMapping(value="/laptops")
    public String getLaptopBrand (Model model) {
        ArrayList<String> laptops = new ArrayList<>();
        laptops.add("Dell");
        laptops.add("HP");
        laptops.add("Asus");
        model.addAttribute("laptops",laptops);
        return "laptop";
    }
}
