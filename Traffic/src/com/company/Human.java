package com.company;

/**
 * Created by User on 05.03.2016.
 */
public class Human {
    private String name;
    private Dog dog;

    public void addDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public Dog getDog() {
        return dog;
    }

    public Human(String name) {
        this.name = name;
    }
    public void getInBus(Bus bus){
        bus.addPassanger(this);
        System.out.print("Person "+this.name+" gets in the bus #"+bus.getId());
        if (this.dog != null){
            System.out.println(" with the dog "+this.dog.getName());
        }
    }
    public void getOutOfBus(Bus bus){
        System.out.println("Person "+this.name+" gets out of the bus #"+bus.getId());
    }

}
