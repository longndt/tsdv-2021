package spring.mvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.mvc.model.Student;

import java.util.ArrayList;

@Controller
public class StudentController {
    ArrayList<Student> students = new ArrayList<>();

    public StudentController() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Student s1 = (Student) applicationContext.getBean("s1");
        Student s2 = (Student) applicationContext.getBean("s2");
        students.add(s1);
        students.add(s2);
    }

    @RequestMapping("/students")
    public String students(Model model) {
        model.addAttribute("students",students);
        return "students";
    }
}
