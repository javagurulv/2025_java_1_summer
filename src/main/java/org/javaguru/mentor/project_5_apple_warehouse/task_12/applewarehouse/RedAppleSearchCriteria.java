package org.javaguru.mentor.project_5_apple_warehouse.task_12.applewarehouse;

class RedAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test (Apple apple) {
        return "red".equals(apple.getColor());
    }
}
