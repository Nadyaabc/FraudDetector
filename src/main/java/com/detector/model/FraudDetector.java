package main.java.com.detector.model;

import java.util.ArrayList;
import java.util.List;

public class FraudDetector {
    List<String> fraudNames = new ArrayList<String>();
    int maxSum;
    public FraudDetector() {
        maxSum = 1000000;
    }
    public FraudDetector(List<String> fraudNames, int maxSum) {
        this.fraudNames.addAll(fraudNames);
        this.maxSum = maxSum;
    }
    public boolean isFraud(Transaction transaction){
        String name = transaction.getTrader().getFullName();
        int sum = transaction.getAmount();
        if (fraudNames.contains(name)) return true;
        if (sum>maxSum) {
            System.out.println("Извините, ставки более " + maxSum + " не являются валидными");
            return true;
        }
        return false;
    }

    public void addFraudNames(String name){
        fraudNames.add(name);
        System.out.println("Мошенник под именем " + name + " успешно добавлен");
    }


}
