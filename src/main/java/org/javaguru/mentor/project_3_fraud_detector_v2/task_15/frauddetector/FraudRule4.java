package org.javaguru.mentor.project_3_fraud_detector_v2.task_15.frauddetector;

class FraudRule4 {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }

}
