package test.java.com.detector;

import main.java.com.detector.model.FraudRuleFour;
import main.java.com.detector.model.Trader;
import main.java.com.detector.model.Transaction;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FraudRuleFourTest {

    private FraudRuleFour fraudRule = new FraudRuleFour();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("Man", "City", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudRule.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("Man", "City", "Italy");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudRule.isFraud(transaction));
    }

}