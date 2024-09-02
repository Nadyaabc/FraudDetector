package main.java.com.detector.model;

import java.util.ArrayList;
import java.util.List;

public class FraudDetector {
    List<String> fraudNames;
    private boolean isFraud(Transaction transaction){
        String name = transaction.getTrader().getFullName();
        if (fraudNames.contains(name)) return true;
        else return false;
    }

    public void addFraudNames(String name){
        if (fraudNames.isEmpty()){
            fraudNames = new ArrayList<String>();
            fraudNames.add(name);
        }
        else {
            fraudNames.add(name);
        }
        System.out.println("Мошенник под именем " + name + "успешно добавлен");
    }

    public FraudDetector() {
    }
}
