package com.cars;

/**
 * Created by User on 26.06.2015.
 */
public class Car {
    public int acceleration;
    public int currentSpead;

    public int incSpeed(int speed) {
        this.currentSpead = speed + acceleration;
        return 1;
    }
}
