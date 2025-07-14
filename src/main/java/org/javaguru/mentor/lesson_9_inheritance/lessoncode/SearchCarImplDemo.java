package org.javaguru.mentor.lesson_9_inheritance.lessoncode;

import java.awt.desktop.OpenFilesEvent;
import java.util.Optional;

class SearchCarImplDemo {

    public static void main(String[] args) {
        SearchCar searchCar = new SearchCarImpl();

        Optional<Car> carOptional = searchCar.searchByNumberV2("");
        if (carOptional.isEmpty()) {
            //
        } else {
            Car car = carOptional.get();
            //
        }

    }

}
