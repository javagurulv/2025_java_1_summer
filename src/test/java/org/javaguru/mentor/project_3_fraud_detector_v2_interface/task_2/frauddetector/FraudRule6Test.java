package org.javaguru.mentor.project_3_fraud_detector_v2_interface.task_2.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FraudRule6Test {

    private FraudRule6 fraudRule = new FraudRule6();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("LOL-123", "Berlin", "Japan");
        Transaction transaction = new Transaction(trader, 77);
        assertTrue(fraudRule.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud_LOL() {
        Trader trader = new Trader("LOL-123", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 77);
        assertFalse(fraudRule.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("Zorro", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 10);
        assertFalse(fraudRule.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud_Japan() {
        Trader trader = new Trader("Zorro", "Berlin", "Japan");
        Transaction transaction = new Transaction(trader, 10);
        assertFalse(fraudRule.isFraud(transaction));
    }

}