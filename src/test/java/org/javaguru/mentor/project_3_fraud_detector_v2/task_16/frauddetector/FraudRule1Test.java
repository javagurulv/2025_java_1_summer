package org.javaguru.mentor.project_3_fraud_detector_v2.task_16.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FraudRule1Test {

    private FraudRule1 fraudRule = new FraudRule1();

    @Test
    public void shouldBeFraudPokemon() {
        Trader trader = new Trader("Pokemon", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudRule.isFraud(transaction));
    }

    @Test
    public void shouldBeFraudDJ() {
        Trader trader = new Trader("DJ", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudRule.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("Zorro", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudRule.isFraud(transaction));
    }

}