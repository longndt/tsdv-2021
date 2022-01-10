package com.example.demo.controller;

import com.example.demo.model.Mobile;
import org.springframework.cache.Cache;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class DemoController {
    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo() {
        String hello = "Hello Spring Boot!";
        return hello;
    }
    @RequestMapping(value="/demo", method = RequestMethod.POST)
    public Integer demo1() {
        return 2022;
    }
    @GetMapping(value = "/demo2")
    public List demo2() {
        Map<String, Integer> persons = new HashMap<>();
        persons.put("Nam",35);
        persons.put("Hung",23);
        List<Map> personList = new ArrayList<>();
        personList.add(persons);
        return personList;
    }

    @GetMapping(value = "/mobilelist")
    public List mobileList() {
        Mobile m1 = new Mobile("iPhone", "Apple", 1200, "Black");
        Mobile m2 = new Mobile("Galaxy", "Samsung", 1100, "White");
        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(m1);
        mobiles.add(m2);
        return mobiles;
    }

    @GetMapping(value = "/hello/{name}/{age}")
    public String sayHello(
            @PathVariable("name") String ten,
            @PathVariable("age") int tuoi) {
        return "Hello " + ten + " - You are " + tuoi + " year old";
    }

    @GetMapping(value = "/person")
    public String showPersonInfo(
            @RequestParam(name="ten", required = false, defaultValue = "Nam") String ten,
            @RequestParam(name="tuoi", required = true) String tuoi
    )
    {
        String hello = "Xin chao " + ten;
        hello += "\nNam nay ban " + tuoi + " tuoi";
        int age = Integer.parseInt(tuoi);
        Calendar calendar = Calendar.getInstance();
        int yob = calendar.get(Calendar.YEAR) - age;
        hello += "\nBan sinh nam " + yob;
        return hello;
    }
}
