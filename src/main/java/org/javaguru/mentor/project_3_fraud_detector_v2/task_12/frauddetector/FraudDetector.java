package org.javaguru.mentor.project_3_fraud_detector_v2.task_12.frauddetector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        return new FraudRule1().isFraud(transaction)
                || new FraudRule2().isFraud(transaction)
                || new FraudRule3().isFraud(transaction)
                || isFraudByRule4(transaction)
                || isFraudByRule5(transaction);
    }

    private boolean isFraudByRule4(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }

    private boolean isFraudByRule5(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Germany")
                && transaction.getAmount() > 1000;
    }

}
