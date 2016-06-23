package com.designpatterns;

/**
 *
 * @author Suresh Sarda (sureshssarda@gmail.com)
 *
 */

public class CarBuilder {

    private int engineCapacity;
    private int tankCapacity;
    private boolean tyres;
    private boolean leatherSeats;

    /**
     * Engine capacity of the car
     * 
     * @param capacityInHp
     * @return CarBuilder
     */
    public CarBuilder withEngingCapacity(int capacityInHp) {
        this.engineCapacity = capacityInHp;
        return this;
    }

    /**
     * Petrol Tank Capacity of the car
     * 
     * @param capacityInLiters
     * @return CarBuilder
     */
    public CarBuilder withPetrolTankCapacity(int capacityInLiters) {
        this.tankCapacity = capacityInLiters;
        return this;
    }

    /**
     * Specify whether the car has tyres.
     * 
     * @return CarBuilder
     */
    public CarBuilder withTyres() {
        this.tyres = true;
        return this;
    }

    /**
     * Leather seats in car
     * 
     * @return CarBuilder
     */
    public CarBuilder withLeatherSeats() {
        this.leatherSeats = true;
        return this;
    }

    /**
     * Create a car object with specified parameters
     * 
     * @return Car
     */
    public Car build() {
        Car car = new Car(engineCapacity, tankCapacity, tyres);
        car.setLeatherSeats(leatherSeats);
        return car;

    }


}
