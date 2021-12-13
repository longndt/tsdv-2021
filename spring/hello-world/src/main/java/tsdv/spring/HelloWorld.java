package tsdv.spring;

public class HelloWorld {
    //attribute
    private String message;

    public HelloWorld() {
    }

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void displayMessage () {
        System.out.println("Hello " + this.message);
    }
}
