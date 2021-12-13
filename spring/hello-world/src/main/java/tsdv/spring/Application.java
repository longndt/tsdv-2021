package tsdv.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld spring = (HelloWorld) applicationContext.getBean("spring");
        HelloWorld world = (HelloWorld) applicationContext.getBean("world");
        spring.displayMessage();
        System.out.println(spring.getMessage());
    }
}

