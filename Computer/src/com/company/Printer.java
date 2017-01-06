package com.company;

/**
 * Created by User on 05.03.2016.
 */

public class Printer {
    public static void print(int size){
        PaperFormat chosenFormat = null;
        for(PaperFormat i : PaperFormat.values()){
            if (size < i.length){
                chosenFormat = i;
                break;
            }
        }
        if (chosenFormat == null){
            System.out.println("Cannot be printed");
        }
        else
            System.out.println("Format is "+chosenFormat);


    }
}
