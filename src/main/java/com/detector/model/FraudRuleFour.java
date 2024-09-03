package main.java.com.detector.model;

public class FraudRuleFour implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        String country = transaction.getTrader().getCountry();
        return country.equals("Jamaica");
    }

    @Override
    public String getRuleName() {
        return "4";
    }
}

