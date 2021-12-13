package spring.bean;

import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class Lecturer {
    private String name;
    private int age;
    private int yob;
    private String email;
    private Mobile mobileNumber;

    public Mobile getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Mobile mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void showLecturerInfo() {
        Calendar calendar = Calendar.getInstance();
        yob = calendar.get(Calendar.YEAR) - age;
        System.out.println("Lecturer name: " + name);
        System.out.println("Lecturer age: " + age);
        System.out.println("Lecturer year of birth: " + yob);
        System.out.println("Lecturer email: " + email);
    }
}
