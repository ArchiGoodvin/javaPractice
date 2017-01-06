package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static final int NUM_OF_SONGS = 5;
    static ArrayList<Person> persons = new ArrayList<Person>(50);
    public static void main(String[] args){
        int k = 0;
        int cont;
        Scanner scanner = new Scanner(System.in);
        do {
            persons.add(inputPerson());
            System.out.println("Press '1' to add a new person");
            cont = scanner.nextInt();
        }while(cont == 1);

        output();
    }

    private static void output() {
        Iterator iterator = persons.iterator();
    }

    private static Person inputPerson() {
        String name;
        String surname;
        Gender gender;
        String genderIn;
        Song[] songs = new Song[NUM_OF_SONGS];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
            name = scanner.next();
        System.out.print("Surname: ");
            surname = scanner.next();
        System.out.print("Gender (m/w): ");
            genderIn = scanner.next();
        for(int i = 0;i < songs.length; i++){
            songs[i] = inputSong();
        }
        if(genderIn == "m"){
            gender = Gender.male;
        }
        else{
            gender = Gender.female;
        }
     return new Person(name,surname,gender,songs);
    }

    private static Song inputSong() {
        int id;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID of the Song: ");
        id = scanner.nextInt();
        return new Song(id,"Some name","Some author");
    }

}
