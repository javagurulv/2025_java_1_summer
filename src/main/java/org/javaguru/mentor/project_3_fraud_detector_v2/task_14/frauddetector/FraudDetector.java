package org.javaguru.mentor.project_3_fraud_detector_v2.task_14.frauddetector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        return new FraudRule1().isFraud(transaction)
                || new FraudRule2().isFraud(transaction)
                || new FraudRule3().isFraud(transaction)
                || new FraudRule4().isFraud(transaction)
                || new FraudRule5().isFraud(transaction);
    }

}
