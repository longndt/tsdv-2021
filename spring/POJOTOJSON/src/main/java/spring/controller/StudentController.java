package spring.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @PostMapping(value = "/student")
    public String getStudent() throws JsonProcessingException {
        Student s1 = new Student(1, "Minh","minh@gmail.com" ,7.5);
        Student s2 = new Student(2, "Linh","linh@gmail.com" ,8.5);
        ArrayList<Student> students = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        students.add(s1);
        students.add(s2);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(studentList);
        return json;
    }
}
