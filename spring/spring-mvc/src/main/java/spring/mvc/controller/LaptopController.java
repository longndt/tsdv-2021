package spring.mvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.mvc.model.Laptop;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
public class LaptopController {
    ArrayList<Laptop> laptops = new ArrayList<>();
    public LaptopController() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Laptop l1 = (Laptop) applicationContext.getBean("laptop1");
        Laptop l2 = (Laptop) applicationContext.getBean("laptop2");
        laptops.add(l1);
        laptops.add(l2);
        Laptop l3 = new Laptop("Zenbook 13", "Asus", 1000, "blue", 1);
        laptops.add(l3);
    }

    @RequestMapping("/")
    public String showLaptopList (Model model) {
        model.addAttribute("laptops", laptops);
        return "laptoplist";
    }

    @RequestMapping("/addlaptop")
    public String addLaptop () {
        return "addlaptop";
    }

    @RequestMapping("/savelaptop")
    public String saveLaptop (HttpServletRequest request) {
        String name = request.getParameter("name");
        String brand = request.getParameter("brand");
        float price = Float.parseFloat(request.getParameter("price"));
        String color = request.getParameter("color");
        float weight = Float.parseFloat(request.getParameter("weight"));
        Laptop l = new Laptop(name, brand, price, color, weight);
        laptops.add(l);
        return "redirect:/";
    }

    @RequestMapping("/deletelaptop/{id}")
    public String deleteLaptop(@PathVariable int id) {
        laptops.remove(id);
        return "redirect:/";
    }
}
