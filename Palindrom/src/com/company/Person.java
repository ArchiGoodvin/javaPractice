package com.company;

/**
 * Created by User on 26.09.2015.
 */
public class Person {
    public String name;
    public String surname;
    public Gender gender;
    public Song[] songs;
    public Person(String name, String surname, Gender gender, Song[] songs){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.songs = songs;

    }
}
