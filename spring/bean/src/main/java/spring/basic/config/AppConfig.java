package spring.basic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.basic.bean.Person;
import spring.basic.bean.Student;
import spring.basic.bean.Teacher;

@Configuration
@ComponentScan(basePackages = "spring.basic")
//@ComponentScan(basePackageClasses = Student.class)
public class AppConfig {
    @Bean("student1")
    public Student getStudent1() {
        return new Student(1,"Tuan","tuan@gmail.com");
    }
    @Bean("student2")
    public Student getStudent2() {
        return new Student(2, "Linh", "linh@gmail.com");
    }
    @Bean("teacher1")
    public Teacher getTeacher1() {
        return new Teacher(1, "Hoang","hoang@gmail.com");
    }
    @Bean("teacher2")
    public Teacher getTeacher2() {
        return new Teacher(2, "Tung","tung@gmail.com");
    }

    @Bean("person")
    public Person getPerson() {
        return new Person("Nguyen Tuan Hung");
    }
}
