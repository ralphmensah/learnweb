package io.turntabl;

public class Main {

    public static void main(String[] args) {

        Car benze = new Car("red", "mkd2020", 200);

        System.out.println("benze color: " + benze.getColor());
        System.out.printf("benze horn: " +  benze.horn());
    }
}