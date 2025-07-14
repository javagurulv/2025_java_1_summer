package org.javaguru.mentor.project_3_fraud_detector_v2_interface.task_2.frauddetector;

class FraudDetector {

    FraudCheckResult isFraud(Transaction transaction) {
        if (new FraudRule1().isFraud(transaction)) {
            return new FraudCheckResult(true, "rule1");
        }
        if (new FraudRule2().isFraud(transaction)) {
            return new FraudCheckResult(true, "rule2");
        }
        if (new FraudRule3().isFraud(transaction)) {
            return new FraudCheckResult(true, "rule3");
        }
        if (new FraudRule4().isFraud(transaction)) {
            return new FraudCheckResult(true, "rule4");
        }
        if (new FraudRule5().isFraud(transaction)) {
            return new FraudCheckResult(true, "rule5");
        }
        if (new FraudRule6().isFraud(transaction)) {
            return new FraudCheckResult(true, "rule6");
        }

        return new FraudCheckResult(false, null);
    }

}
