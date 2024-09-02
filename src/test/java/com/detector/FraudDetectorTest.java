package test.java.com.detector;

import main.java.com.detector.model.FraudDetector;
import main.java.com.detector.model.Trader;
import main.java.com.detector.model.Transaction;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {
    FraudDetector fraudDetector = new FraudDetector();
    {
        fraudDetector.addFraudNames("Anonymous");
    }
    Transaction transactionTrue = new Transaction(new Trader("Anonymous", "Minsk"), 15000000);
    Transaction transactionFalse = new Transaction(new Trader("Not Anonymous", "Paris"), 150);

    @Test
    public void findFraudByTraderNameReturnTrue(){
        assertTrue(fraudDetector.isFraud(transactionTrue));
    }

    @Test
    public void findFraudByTraderNameReturnFalse(){
        assertFalse(fraudDetector.isFraud(transactionFalse));
    }

    @Test
    public void findFraudByMaxSumReturnTrue(){
        assertTrue(fraudDetector.isFraud(transactionTrue));
    }
    @Test
    public void findFraudByMaxSumReturnFalse(){
        assertFalse(fraudDetector.isFraud(transactionFalse));
    }
}
