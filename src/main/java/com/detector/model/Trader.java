package main.java.com.detector.model;

public class Trader {
    public String fullName;
    public String city;

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }
}
