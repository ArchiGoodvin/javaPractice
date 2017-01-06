package com.company;

/**
 * Created by User on 10.06.2016.
 */
public class Data {
    private String message;
    private float probability;

    @Override
    public String toString() {
        return probability + "| "+message;
    }

    Data(String message, float probability){
        this.message = message;
        this.probability = probability;
    }


}
