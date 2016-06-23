package com.designpatterns.gun;

/**
 * An interface that every gun must implement.
 * 
 * @author Suresh Sarda (suresh.sarda@infibeam.net)
 *
 */

public interface Gun {

    /**
     * Fire minimum number of rounds the gun can fire
     */
    public void fire();

    /**
     * Reload the gun
     */
    public void reload();
}
