package test.java.com.detector;

import main.java.com.detector.model.FraudRuleOne;
import main.java.com.detector.model.Trader;
import main.java.com.detector.model.Transaction;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FraudRuleOneTest {

    private FraudRuleOne fraudRule = new FraudRuleOne();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("Pokemon", "London", "Great Britain");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudRule.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("Not Pokemon", "London", "Great Britain");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudRule.isFraud(transaction));
    }
}