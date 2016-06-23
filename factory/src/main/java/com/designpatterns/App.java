package com.designpatterns;

import com.designpatterns.gun.Gun;
import com.designpatterns.gun.GunFactory;

/**
 * Factory Pattern
 *
 */
public class App {
    public static void main(String[] args) {
        // create a new gun. Note that we don't have to worry about its concrete implementation.
        // we are just using it to an abstraction.
        // it's a Gun and that's all we care about
        Gun pistol = GunFactory.createPistol();
        pistol.fire();
        pistol.reload();

        // Similarly a machine gun
        Gun machine = GunFactory.createMachineGun();
        machine.fire();
        machine.fire();
        machine.fire();

        machine.reload();

        pistol.fire();
        pistol.fire();
        pistol.fire();

        // we can use different methods to crate different types of machine guns without actually worrying about their
        // configurations
        Gun largeMachine = GunFactory.createLargeMachineGun();
        largeMachine.fire();

        // a super large machine gun fires 20 rounds at a time. But we don't have to worry about that.
        // the factory takes care about everything.
        Gun superLargeMachine = GunFactory.createSuperLargeMachineGun();
        superLargeMachine.fire();
        superLargeMachine.fire();

    }
}
