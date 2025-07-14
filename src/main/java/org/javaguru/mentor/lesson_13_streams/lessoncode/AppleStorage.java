package org.javaguru.mentor.lesson_13_streams.lessoncode;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class AppleStorage {

    public List<Apple> getGreenApples() {
        List<Apple> greenApples = new ArrayList<>();

        for (Apple apple : getAllApples()) {
            if (apple.getColor().equals("green")) {
                greenApples.add(apple);
            }
        }

        return greenApples;
    }

    public List<Apple> getRedApples() {
        List<Apple> redApples = new ArrayList<>();

        for (Apple apple : getAllApples()) {
            if (apple.getColor().equals("red")) {
                redApples.add(apple);
            }
        }

        return redApples;
    }

    public List<Apple> getApplesByColor(String color) {
        List<Apple> apples = new ArrayList<>();

        for (Apple apple : getAllApples()) {
            if (apple.getColor().equals(color)) {
                apples.add(apple);
            }
        }

        return apples;
    }

    public List<Apple> getLightWeightApples(int weightThreshold) {
        List<Apple> apples = new ArrayList<>();

        for (Apple apple : getAllApples()) {
            if (apple.getWeight() < weightThreshold) {
                apples.add(apple);
            }
        }

        return apples;
    }

    public List<Apple> getHeavyWeightApples(int weightThreshold) {
        List<Apple> apples = new ArrayList<>();

        for (Apple apple : getAllApples()) {
            if (apple.getWeight() >= weightThreshold) {
                apples.add(apple);
            }
        }

        return apples;
    }

    public WeightResult getApplesByWeight(int weight) {
        return new WeightResult(
                getLightWeightApples(weight),
                getHeavyWeightApples(weight)
        );
    }

    public List<Apple> getApplesBySearchCriteria(AppleSearchCriteria searchCriteria) {
        List<Apple> apples = new ArrayList<>();

        for (Apple apple : getAllApples()) {
            if (searchCriteria.match(apple)) {
                apples.add(apple);
            }
        }

        return apples;
    }

    // Stream API

    public Set<String> getUniqAppleColors() {
        return getAllApples().stream()
                .map(apple -> apple.getColor())
                .collect(Collectors.toSet());
    }

    public Optional<Integer> findLightweightAppleWeight() {
        return getAllApples().stream()
                .map(apple -> apple.getWeight())
                .sorted()
                .findFirst();
    }

    public List<Apple> findHeavyApples() {
        return getAllApples().stream()
                .filter(apple -> apple.getWeight() >= 150)
                .collect(Collectors.toList());
    }

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }


}
