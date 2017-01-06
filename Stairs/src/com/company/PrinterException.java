package com.company;

/**
 * Created by User on 05.08.2015.
 */
public class PrinterException extends Exception{
    String model;

    PrinterException(String message, String model){
        super(message);
        this.model = model;

    }




}
