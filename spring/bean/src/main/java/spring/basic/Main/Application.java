package spring.basic.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.basic.bean.Student;
import spring.basic.bean.Teacher;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s1 = (Student) applicationContext.getBean("s1");
//        System.out.println(s1.toString());
//        s1.show();
        Student student = applicationContext.getBean("student",Student.class);
        student.show();
        Teacher t1 = applicationContext.getBean("t1",Teacher.class);
        t1.show();
    }
}
