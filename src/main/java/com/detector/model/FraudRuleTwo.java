package main.java.com.detector.model;

public class FraudRuleTwo implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        FraudDetector fraudDetector = new FraudDetector();
        int sum = transaction.getAmount();
        if (sum> fraudDetector.getMaxSum()) {
            System.out.println("Извините, ставки более " + fraudDetector.getMaxSum() + " не являются валидными");
            return true;
        }
        return false;
    }
    @Override
    public String getRuleName() {
        return "2";
    }
}
