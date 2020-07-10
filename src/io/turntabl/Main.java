package io.turntabl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<Car>(Arrays.asList(
                new Car("Benze", "A234", 300),
                new Car("Picanto", "B234", 400)
        ));

        System.out.println("Car list >> " + carList);
        System.out.println("lenght : " + carList.size());

        Car taxi = new Car("taxi", "E3545", 150);
        carList.add(taxi);

        System.out.println("Car list 2 : " + carList);
        System.out.println("length: " + carList.size());

        System.out.println("for each loop..");
        for (Car car: carList) {
            System.out.println(car.getType());
        }

    }
}