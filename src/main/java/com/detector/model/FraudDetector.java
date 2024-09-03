package main.java.com.detector.model;

import java.util.ArrayList;
import java.util.List;

public class FraudDetector {
    private  List<String> fraudNames;
    private List<String> fraudCities;
    private int maxSum;
    private List<FraudRule> fraudRules;

    public FraudDetector(){
        this.fraudNames = new ArrayList<>();
        this.fraudCities = new ArrayList<>();
        this.maxSum = 1000000;
        this.fraudRules = List.of(new FraudRuleOne(), new FraudRuleTwo(), new FraudRuleThree(), new FraudRuleFour(), new FraudRuleFive());
        initializeDefaultFraudNames();
        initializeDefaultFraudCities();
    }

    public FraudDetector(List<String> fraudNames, int maxSum, List<String>fraudCities) {
        this.fraudNames = new ArrayList<>(fraudNames);
        this.maxSum = maxSum;
        this.fraudCities = new ArrayList<>(fraudCities);
        this.fraudRules = List.of(new FraudRuleOne(), new FraudRuleTwo(), new FraudRuleThree(), new FraudRuleFour(), new FraudRuleFive());
        initializeDefaultFraudNames();
        initializeDefaultFraudCities();
    }

    private void initializeDefaultFraudNames() {
        fraudNames.add("Pokemon");
    }

    private void initializeDefaultFraudCities() {
        fraudCities.add("Sydney");
    }

    public FraudDetectionResult isFraud(Transaction transaction){
        for (FraudRule rule : fraudRules){
            if (rule.isFraud(transaction)) return new FraudDetectionResult(rule.getRuleName(), true);
        }
        return new FraudDetectionResult("none", false);
    }

    public void addFraudName(String name){
        fraudNames.add(name);
        System.out.println("Мошенник под именем " + name + " успешно добавлен");
    }
    public void addFraudCity(String city){
        fraudCities.add(city);
        System.out.println("Город " + city + " успешно добавлен");
    }

    public List<String> getFraudNames() {
        return fraudNames;
    }

    public List<String> getFraudCities() {
        return fraudCities;
    }

    public int getMaxSum() {
        return maxSum;
    }

    public List<FraudRule> getFraudRules() {
        return fraudRules;
    }

    public void setMaxSum(int i) {
        maxSum = i;
    }
}
