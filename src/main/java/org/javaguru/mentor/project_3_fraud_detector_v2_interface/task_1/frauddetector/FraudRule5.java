package org.javaguru.mentor.project_3_fraud_detector_v2_interface.task_1.frauddetector;

class FraudRule5 {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Germany")
                && transaction.getAmount() > 1000;
    }

}
