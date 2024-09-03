package main.java.com.detector.model;

public class Trader {
    public String fullName;
    public String city;
    public String country;

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry(){
        return country;
    }
    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }
    public String getTraderInfo(){
        return "Имя: " + fullName + "\nГород: " + city + "\nСтрана: " + country + "\n";
    }
}
