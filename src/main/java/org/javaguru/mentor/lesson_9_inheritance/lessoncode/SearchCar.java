package org.javaguru.mentor.lesson_9_inheritance.lessoncode;

import java.util.Optional;

interface SearchCar {

    Car searchByNumber(String number);

    Optional<Car> searchByNumberV2(String number);

}
