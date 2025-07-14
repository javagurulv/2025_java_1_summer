package org.javaguru.mentor.lesson_9_inheritance.lessoncode;

import java.util.Optional;

class SearchCarImpl implements SearchCar {
    @Override
    public Car searchByNumber(String number) {
        return null;
    }

    @Override
    public Optional<Car> searchByNumberV2(String number) {
        return Optional.empty();
    }
}
