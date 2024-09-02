package test.java.com.detector;

import main.java.com.detector.model.FraudDetector;
import main.java.com.detector.model.Trader;
import main.java.com.detector.model.Transaction;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {
    FraudDetector fraudDetector = new FraudDetector();

    @Test
    public void findFraudByTraderNameReturnTrue(){
        Transaction transaction = new Transaction(new Trader("Pokemon", "Not Synney"), 1500);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void findFraudByTraderNameReturnFalse(){
        Transaction transaction = new Transaction(new Trader("Not Pokemon", "Not Synney"), 1500);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void findFraudByMaxSumReturnTrue(){
        Transaction transaction = new Transaction(new Trader("Not Pokemon", "Not Synney"), 15000000);
        assertTrue(fraudDetector.isFraud(transaction));
    }
    @Test
    public void findFraudByMaxSumReturnFalse(){
        Transaction transaction = new Transaction(new Trader("Not Pokemon", "Not Synney"), 1500);
        assertFalse(fraudDetector.isFraud(transaction));
    }
    @Test
    public void findFraudByCityReturnTrue(){
        Transaction transaction = new Transaction(new Trader("Not Pokemon", "Sydney"), 1500);
        assertTrue(fraudDetector.isFraud(transaction));
    }
    @Test
    public void findFraudByCityReturnFalse(){
        Transaction transaction = new Transaction(new Trader("Not Pokemon", "Not Sydney"), 1500);
        assertFalse(fraudDetector.isFraud(transaction));
    }
}
