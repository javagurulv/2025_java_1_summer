package org.javaguru.mentor.project_5_apple_warehouse.task_11.applewarehouse;

class GreenAndHeavyAppleSearchCriteria implements AppleSearchCriteria {

    private GreenAppleSearchCriteria greenApples = new GreenAppleSearchCriteria();
    private HeavyAppleSearchCriteria heavyApples = new HeavyAppleSearchCriteria();

    @Override
    public boolean test(Apple apple) {
        return greenApples.test(apple) && heavyApples.test(apple);
    }

}