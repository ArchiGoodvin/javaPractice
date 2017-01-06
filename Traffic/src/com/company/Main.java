package com.company;

public class Main {
    public static Bus[] buses = new Bus[5];
    public static Human[] passengers = new Human[10];
    public static void main(String[] args) {
        buses[1] = new Bus(5);
        buses[2] = new Bus(2);
        passengers[1] = new Human("Vasily");
        passengers[1].addDog(new Dog("Sharik"));
        passengers[1].getInBus(buses[1]);
        passengers[0] = new Human("Alexander");
        passengers[0].getInBus(buses[2]);




    }
}
