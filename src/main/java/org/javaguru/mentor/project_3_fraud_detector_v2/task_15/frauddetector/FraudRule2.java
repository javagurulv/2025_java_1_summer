package org.javaguru.mentor.project_3_fraud_detector_v2.task_15.frauddetector;

class FraudRule2 {

    boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }

}
