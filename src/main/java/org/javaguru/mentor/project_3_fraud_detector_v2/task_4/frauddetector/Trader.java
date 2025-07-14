package org.javaguru.mentor.project_3_fraud_detector_v2.task_4.frauddetector;

class Trader {

    private String fullName;
    private String city;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }
}
