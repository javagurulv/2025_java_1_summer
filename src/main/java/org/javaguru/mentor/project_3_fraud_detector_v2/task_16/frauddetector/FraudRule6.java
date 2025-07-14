package org.javaguru.mentor.project_3_fraud_detector_v2.task_16.frauddetector;

class FraudRule6 {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getFullName().startsWith("LOL-")
                && trader.getCountry().equals("Japan");
    }

}
