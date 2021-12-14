package spring.basic.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.basic.bean.Person;
import spring.basic.bean.Student;
import spring.basic.bean.Teacher;
import spring.basic.config.AppConfig;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Student s1 = applicationContext.getBean("student1",Student.class);
        System.out.println(s1.toString());
        Teacher t1 = applicationContext.getBean("teacher1", Teacher.class);
        System.out.println(t1.toString());
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person.toString());
    }
}
