package org.javaguru.mentor.project_3_fraud_detector_v2_interface.task_2.frauddetector;

class FraudCheckResult {

    private boolean fraud;
    private String ruleName;

    public FraudCheckResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean isFraud() {
        return fraud;
    }

    public String getRuleName() {
        return ruleName;
    }
}
