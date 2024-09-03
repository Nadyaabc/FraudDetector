package main.java.com.detector.model;

public class FraudRuleThree implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        FraudDetector fraudDetector = new FraudDetector();
        String city = transaction.getTrader().getCity();
        return fraudDetector.getFraudCities().contains(city);
    }
    @Override
    public String getRuleName() {
        return "3";
    }
}
