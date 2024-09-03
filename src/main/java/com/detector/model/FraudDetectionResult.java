package main.java.com.detector.model;

public class FraudDetectionResult {
    private String ruleNumber;
    private boolean result;

    public FraudDetectionResult() {
    }

    public FraudDetectionResult(String number, boolean result){
        this.ruleNumber = number;
        this.result = result;
    }
    public boolean isFraud(){return result;}

    public String getRuleNumber() {
        return ruleNumber;
    }
}
