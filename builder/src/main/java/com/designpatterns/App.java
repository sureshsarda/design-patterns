package com.designpatterns;

/**
 * Builder Patter
 *
 * Demonstration of builder pattern
 */
public class App {
    public static void main(String[] args) {

        // Creating object using builder
        // achieve some power of a variable length constructor
        Car cheapCar = new CarBuilder().withEngingCapacity(100).withPetrolTankCapacity(100).build();
        System.out.println(cheapCar);

        Car expensiveCar =
                new CarBuilder().withEngingCapacity(600).withPetrolTankCapacity(250).withTyres().withLeatherSeats()
                        .build();

        System.out.println(expensiveCar);
    }
}
