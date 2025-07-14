package org.javaguru.mentor.lesson_13_streams.lessoncode;

@FunctionalInterface
public interface AppleSearchCriteria {

    boolean match(Apple apple);

}

// apple.getColor().equals("green")

class GreenAppleSearchCriteria implements AppleSearchCriteria {

    @Override
    public boolean match(Apple apple) {
        return apple.getColor().equals("green");
    }

}

// apple.getColor().equals("red")

class RedAppleSearchCriteria implements AppleSearchCriteria {

    @Override
    public boolean match(Apple apple) {
        return apple.getColor().equals("red");
    }

}

// apple.getWeight() < weightThreshold

class LightWeightAppleSearchCriteria implements AppleSearchCriteria {

    private int weightThreshold;

    public LightWeightAppleSearchCriteria(int weightThreshold) {
        this.weightThreshold = weightThreshold;
    }

    @Override
    public boolean match(Apple apple) {
        return apple.getWeight() < weightThreshold;
    }

}


// apple.getWeight() < weightThreshold

class HeavyWeightAppleSearchCriteria implements AppleSearchCriteria {

    private int weightThreshold;

    public HeavyWeightAppleSearchCriteria(int weightThreshold) {
        this.weightThreshold = weightThreshold;
    }

    @Override
    public boolean match(Apple apple) {
        return apple.getWeight() >= weightThreshold;
    }

}


class AppleAndSearchCriteria implements AppleSearchCriteria {

    private AppleSearchCriteria criteria1;
    private AppleSearchCriteria criteria2;

    public AppleAndSearchCriteria(AppleSearchCriteria criteria1,
                                  AppleSearchCriteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public boolean match(Apple apple) {
        return criteria1.match(apple) && criteria2.match(apple);
    }

}

class AppleOrSearchCriteria implements AppleSearchCriteria {

    private AppleSearchCriteria criteria1;
    private AppleSearchCriteria criteria2;

    public AppleOrSearchCriteria(AppleSearchCriteria criteria1,
                                 AppleSearchCriteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public boolean match(Apple apple) {
        return criteria1.match(apple) || criteria2.match(apple);
    }

}
