package com.designpatterns;

/**
 *
 * @author Suresh Sarda (sureshssarda@gmail.com)
 *
 */

public class Car {

    private int engineCapacity;
    private int tankCapacity;
    private boolean tyres;
    private boolean leatherSeats;

    /*
     * A package private constructors so people cannot acces it.
     */
    Car(int engineCapacity, int tankCapacity, boolean tyres) {
        this.engineCapacity = engineCapacity;
        this.tankCapacity = tankCapacity;
        this.tyres = tyres;
    }

    void setLeatherSeats(boolean seats) {
        this.leatherSeats = seats;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Engine: %d Hp, Tank: %dL, ", engineCapacity, tankCapacity));
        sb.append("Tyres: ");
        sb.append(tyres ? "Present, " : "Absent, ");

        sb.append("Seats: ");
        sb.append(leatherSeats ? "Leather " : "Non Leather ");
        return sb.toString();
    }
}
