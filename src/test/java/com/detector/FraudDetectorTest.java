package test.java.com.detector;

import main.java.com.detector.model.FraudDetector;
import main.java.com.detector.model.Trader;
import main.java.com.detector.model.Transaction;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {
    @Test
    public void findFraudByTraderNameReturnTrue(){
        FraudDetector fraudDetector = new FraudDetector();
        fraudDetector.addFraudNames("anonymous");
        Transaction transaction = new Transaction(new Trader("anonymous", "moskow"), 1500);
        assertTrue(fraudDetector.isFraud(transaction));
    }
    @Test
    public void findFraudByTraderNameReturnFalse(){
        FraudDetector fraudDetector = new FraudDetector();
        fraudDetector.addFraudNames("anonymous");
        Transaction transaction = new Transaction(new Trader("notAnonymous", "moskow"), 1500);
        assertFalse(fraudDetector.isFraud(transaction));
    }
}
