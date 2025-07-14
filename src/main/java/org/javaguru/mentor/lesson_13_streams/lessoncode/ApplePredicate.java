package org.javaguru.mentor.lesson_13_streams.lessoncode;

@FunctionalInterface
interface ApplePredicate {
    boolean test(Apple apple);
}

// apple.getColor().equals("green")
class GreenApplePredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }
}

// apple.getColor().equals("red")
class RedApplePredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }
}

// apple.getWeight() <= limitWeight
class LigthWeightApplePredicate implements ApplePredicate {

    private int limitWeight;

    public LigthWeightApplePredicate(int limitWeight) {
        this.limitWeight = limitWeight;
    }

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() <= limitWeight;
    }
}


// apple.getWeight() > limitWeight
class HeavyWeightApplePredicate implements ApplePredicate {

    private int limitWeight;

    public HeavyWeightApplePredicate(int limitWeight) {
        this.limitWeight = limitWeight;
    }

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > limitWeight;
    }
}


