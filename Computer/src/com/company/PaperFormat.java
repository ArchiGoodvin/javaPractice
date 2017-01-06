package com.company;

/**
 * Created by User on 05.03.2016.
 */
public enum PaperFormat {
    A5(10,"A5"),
    A4(15,"A4"),
    A3(20,"A3");
    int length;
    String form;
    PaperFormat(int length, String form) {
        this.length = length;
        this.form = form;
    }
}
