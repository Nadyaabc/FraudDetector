package test.java.com.detector;

import main.java.com.detector.model.FraudRuleThree;
import main.java.com.detector.model.Trader;
import main.java.com.detector.model.Transaction;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FraudRuleThreeTest {

    private FraudRuleThree fraudRule = new FraudRuleThree();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("John", "Sydney", "Belgium");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudRule.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("John", "Not Sydney", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudRule.isFraud(transaction));
    }

}