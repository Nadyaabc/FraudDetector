package main.java.com.detector.model;


public class FraudRuleOne implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        FraudDetector fraudDetector = new FraudDetector();
        String name = transaction.getTrader().getFullName();
        return fraudDetector.getFraudNames().contains(name);
    }
    @Override
    public String getRuleName() {
        return "1";
    }
}
