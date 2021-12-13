package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.bean.Lecturer;
import spring.bean.Student;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        Student s1 = (Student) applicationContext.getBean("student1");
       s1.showStudentInfo();
        Student s2 = (Student) applicationContext.getBean("student2");
       s2.showStudentInfo();
        Lecturer l1 = (Lecturer) applicationContext.getBean("lecturer1");
       l1.showLecturerInfo();
       Lecturer l2 = (Lecturer) applicationContext.getBean("lecturer2");
        l2.showLecturerInfo();
       String[] list = applicationContext.getBeanDefinitionNames();
        for (String l : list ) {
           System.out.println(l);
       }
        Student s3 = (Student) applicationContext.getBean("s3");
        s3.showStudentMobile();
    }
}
