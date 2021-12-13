package spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

public class Mobile {
    private String mobile;

    public Mobile() {
        mobile = "0988888888";
    }

    public Mobile(String mobile) {
        this.mobile = mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }
}
