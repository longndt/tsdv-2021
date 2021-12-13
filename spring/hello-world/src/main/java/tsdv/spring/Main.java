package tsdv.spring;

public class Main {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.setMessage("Hello World");
        System.out.println(hello.getMessage());
        HelloWorld welcome = new HelloWorld("Hello Spring");
        welcome.displayMessage();
    }
}
