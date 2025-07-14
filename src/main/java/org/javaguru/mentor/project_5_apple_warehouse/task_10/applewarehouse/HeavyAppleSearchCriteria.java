package org.javaguru.mentor.project_5_apple_warehouse.task_10.applewarehouse;

class HeavyAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test (Apple apple) {
        return apple.getWeight() > 150;
    }
}
