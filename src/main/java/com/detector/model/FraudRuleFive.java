package main.java.com.detector.model;

public class FraudRuleFive implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        String country = transaction.getTrader().getCountry();
        return country.equals("Germany")&& transaction.getAmount() >1000;
    }

    @Override
    public String getRuleName() {
        return "5";
    }
}
