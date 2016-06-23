package com.designpatterns.gun;

/**
 *
 * @author Suresh Sarda (suresh.sarda@infibeam.net)
 *
 */

public class Pistol implements Gun {

    /*
     * Package scoped constructors so that no one can use them
     */
    Pistol() {}

    public void fire() {
        System.out.println("Pistol: Fired 1 round");
    }

    public void reload() {
        System.out.println("Pistol: Reloaded with 6 bullets.");

    }

}
