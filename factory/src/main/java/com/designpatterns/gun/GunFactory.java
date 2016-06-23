package com.designpatterns.gun;

/**
 *
 * @author Suresh Sarda (suresh.sarda@infibeam.net)
 *
 */

public class GunFactory {

    /**
     * Creates a standard pistol
     * 
     * @return Pistol
     */
    public static Pistol createPistol() {
        return new Pistol();
    }

    /*
     * We can have multiple methods to create having friendly names. Following 3 methods create machine guns of
     * different sizes.
     */
    /**
     * Creates a standard machine gun
     * 
     * @return MachineGun
     */
    public static MachineGun createMachineGun() {
        return new MachineGun();
    }

    /**
     * Create a large machine gun capable of firing large rounds at once.
     * 
     * @return MachineGun
     */
    public static MachineGun createLargeMachineGun() {
        return new MachineGun(15);
    }

    /**
     * 
     * Super large machine gun. Very powerful, fires large number of rounds together.
     * 
     * @return MachineGun
     */
    public static MachineGun createSuperLargeMachineGun() {
        return new MachineGun(20);
    }
}
