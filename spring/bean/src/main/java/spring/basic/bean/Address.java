package spring.basic.bean;

public class Address {
    private int number;
    private String name;

    public Address() {
    }

    public Address(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Address{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    public void show() {
        System.out.println("Address: " + number + " " + name);
    }
}
