package main.java.com.detector.model;

import java.util.ArrayList;
import java.util.List;

public class FraudDetector {
    List<String> fraudNames = new ArrayList<String>();
    {
        fraudNames.add("Pokemon");
    }
    List<String> fraudCities = new ArrayList<String>();
    {
        fraudCities.add("Sydney");
    }
    int maxSum;
    public FraudDetector() {
        maxSum = 1000000;
    }
    public FraudDetector(List<String> fraudNames, int maxSum, List<String>fraudCities) {
        this.fraudNames.addAll(fraudNames);
        this.fraudCities.addAll(fraudCities);
        this.maxSum = maxSum;
    }
    public boolean isFraud(Transaction transaction){
        String name = transaction.getTrader().getFullName();
        String city = transaction.getTrader().getCity();
        int sum = transaction.getAmount();
        if (fraudNames.contains(name)) return true;
        if (sum>maxSum) {
            System.out.println("Извините, ставки более " + maxSum + " не являются валидными");
            return true;
        }
        if (fraudCities.contains(city)) return true;
        return false;
    }

    public void addFraudNames(String name){
        fraudNames.add(name);
        System.out.println("Мошенник под именем " + name + " успешно добавлен");
    }
    public void addFraudCities(String city){
        fraudCities.add(city);
        System.out.println("Город " + city + " успешно добавлен");
    }

}
