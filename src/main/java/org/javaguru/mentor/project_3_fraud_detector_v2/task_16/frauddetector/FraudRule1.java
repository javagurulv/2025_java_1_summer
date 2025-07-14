package org.javaguru.mentor.project_3_fraud_detector_v2.task_16.frauddetector;

class FraudRule1 {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        var traderFullName = trader.getFullName();
        return traderFullName.equals("Pokemon") || traderFullName.equals("DJ");
    }

}
