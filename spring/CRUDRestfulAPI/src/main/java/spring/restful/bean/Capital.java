package spring.restful.bean;

public class Capital {
    private int id;
    private String capital;
    private String country;

    public Capital() {
    }

    public Capital(int id, String capital, String country) {
        this.id = id;
        this.capital = capital;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
