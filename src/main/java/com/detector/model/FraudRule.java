package main.java.com.detector.model;

public interface FraudRule {
    public boolean isFraud(Transaction transaction);
    public String getRuleName();
}
