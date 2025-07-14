package org.javaguru.mentor.project_3_fraud_detector_v2_interface.task_1.frauddetector;

class FraudRule2 {

    boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }

}
