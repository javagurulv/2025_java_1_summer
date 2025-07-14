package org.javaguru.mentor.project_3_fraud_detector_v2.task_12.frauddetector;

class FraudRule3 {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sydney");
    }

}
