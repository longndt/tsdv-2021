package spring.mvc.model;

public class Laptop {
    private String name;
    private String brand;
    private float price;
    private String color;
    private float weight;

    public Laptop() {

    }
    public Laptop(String name, String brand, float price, String color, float weight) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
