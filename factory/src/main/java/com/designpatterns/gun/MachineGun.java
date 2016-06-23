package com.designpatterns.gun;

/**
 *
 * @author Suresh Sarda (sureshssarda@gmail.net)
 *
 */

public class MachineGun implements Gun {

    int roundsFiredTogether = 5;

    /*
     * Package scoped constructors so that no one can use them
     */
    MachineGun() {}

    MachineGun(int rounds) {
        this.roundsFiredTogether = rounds;
    }


    
    public void fire() {
        String message = String.format("MachineGun: Fired %d rounds", this.roundsFiredTogether);
        System.out.println(message);

    }

    public void reload() {
        System.out.println("MachineGun: Reloading..");

    }

}
