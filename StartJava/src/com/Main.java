package com;

import com.buildings.Building;
import com.humans.*;
import com.cars.Car;
import java.util.Arrays;

/**
 * Created by User on 02.01.2009.
 */
class Main{

    public static void main(String... args ){

        Human human = new Human();
        human.age = 12;
        human.name="Peter";
        System.out.println(human.age);

        Human sasha = null;
        sasha = new Human();
        sasha.name="Alexander";
        sasha.sirname="Kolesnik";
        sasha.sex=true;
        sasha.age=17;

        System.out.printf(sasha.name + " " + human.name);

        Building halupa = new Building();
        halupa.adress="Maidan Nezalezhnosti";
        halupa.flors=250;

        Building barak = new Building();
        barak.adress = "Times Square";
        barak.flors=5;

        System.out.printf(" Flors 0f halupa: " + halupa.flors);
        System.out.println("");
        int total =  halupa.flors+barak.flors ;
        System.out.printf("Total number of floors: " + total);
        System.out.println("");

        Car lamb = new Car();
        lamb.acceleration=6;
        lamb.currentSpead=20;
       System.out.printf("Current speed of Lamborgini is " + lamb.incSpeed(lamb.currentSpead));
        System.out.println("");
        System.out.println(lamb.currentSpead);

        Car zapor = new Car();
        zapor.acceleration=1;
        zapor.currentSpead=10;

        System.out.println(Car.class);

     Enemy[] enemy = new Enemy[5];
        enemy[0]=new Enemy();
     enemy[0].power = 50;
        System.out.println(Array.toString(enemy));



    }
}
