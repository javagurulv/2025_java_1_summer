package org.javaguru.mentor.project_3_fraud_detector.task_17.frauddetector;

interface FraudRule {

    boolean isFraud(Transaction transaction);

    String getRuleName();

}
