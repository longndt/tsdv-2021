package spring.bean;

import org.springframework.stereotype.Component;

public class Student {
    private int id;
    private String name;
    private String email;
    private double grade;
    private String address;
    private Mobile mobile;

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student name: " + name);
        System.out.println("Student email: " + email);
        System.out.println("Student grade: " + grade);
        System.out.println("Student address: " + address);
//        System.out.println("Student mobile: " + mobile.getMobile());
    }

    public void showStudentMobile() {
        System.out.println("Student mobile: " + mobile.getMobile());
    }
}
