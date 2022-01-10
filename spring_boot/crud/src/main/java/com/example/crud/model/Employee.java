package com.example.crud.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "nhanvien")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Long id;

    @NotEmpty(message = "Name can not be empty")
    private String name;

    @Min(18)
    @Max(50)
    private int age;

    @Size(min = 5, max = 20)
    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
