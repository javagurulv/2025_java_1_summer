package org.javaguru.mentor.lesson_9_inheritance.lessoncode;

import java.util.ArrayList;
import java.util.List;

class CarApplication {

    public static void main(String[] args) {
        Ferri ferri = new Ferri("red", true);
        ferri.changeColor("blue");
        ferri.changeElectric(false);

        Bmw bmw = new Bmw("red", true);

        Car car = null;
        car = ferri;
        //car = bmw;

        car.changeColor("yellow");


        List<Car> cars = new ArrayList<>();
        cars.add(ferri);
        cars.add(bmw);

        for (Car car1 : cars) {
            car1.changeColor("BLACK");
            System.out.println(car1.toString());
        }

    }

}
