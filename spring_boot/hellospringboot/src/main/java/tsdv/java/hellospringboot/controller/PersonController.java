package tsdv.java.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tsdv.java.hellospringboot.model.Person;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {
    @RequestMapping("/person")
    public String personList(Model model) {
        Person p1 = new Person(1,"Minh",23, "Ha Noi");
        Person p2 = new Person(2,"Tien",24, "HCM City");
        Person p3 = new Person(3,"Huong",25, "Da Nang");
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        model.addAttribute("persons", personList);
        return "person";
    }
}
