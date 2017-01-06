package com.company;

/**
 * Created by User on 05.03.2016.
 */
public class Bus {
    private int id;

    private static int numOfPassengers = -1;
    private Human[] passengers = new Human[30];
    public Bus(int id) {
        this.id = id;
    }
    public int passengersAmount(){
        return numOfPassengers+1;
    }

    public void addPassanger(Human passengers) {
        numOfPassengers++;
        this.passengers[numOfPassengers] = passengers;
        System.out.println("There are "+passengersAmount()+" passengers in the bus #"+getId());

    }

    public int getId() {
        return id;
    }
    public void moveTo(String station){
        System.out.println("Going to "+ station);
    }
    public void moveFrom(String station){
        System.out.println("Leaving "+station);
    }
}
