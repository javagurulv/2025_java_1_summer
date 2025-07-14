package org.javaguru.mentor.lesson_13_streams.lessoncode;

import java.util.List;

public class WeightResult {

    private List<Apple> lightWeightApples;
    private List<Apple> heavyWeightApples;

    public WeightResult(List<Apple> lightWeightApples, List<Apple> heavyWeightApples) {
        this.lightWeightApples = lightWeightApples;
        this.heavyWeightApples = heavyWeightApples;
    }

    public List<Apple> getLightWeightApples() {
        return lightWeightApples;
    }

    public List<Apple> getHeavyWeightApples() {
        return heavyWeightApples;
    }
}
