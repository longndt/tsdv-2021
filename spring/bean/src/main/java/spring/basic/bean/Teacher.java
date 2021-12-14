package spring.basic.bean;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
    private int id;
    private String name;
    private String email;
    private Mobile mobile;
    private Address address;

    public Teacher(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Teacher() {
    }

    public Teacher(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Teacher(Mobile mobile) {
        this.mobile = mobile;
    }

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

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile.toString() +
                '}';
    }

    public void show() {
        System.out.println("Teacher ID: " + id);
        System.out.println("Teacher Name: " + name);
//        System.out.println("Mobile Name: " + mobile.getName());
//        System.out.println("Mobile Price: " + mobile.getPrice());
        System.out.println(mobile.toString());
        address.show();
    }
}
