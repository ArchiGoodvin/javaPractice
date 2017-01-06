package com.company;

import lib.MyList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyList list = new MyList();
        list.addToTail(5);
        list.addToTail(6);
        list.addToTail(10);
        list.addToTail(5);
        list.addToHead(845);
        list.addToTail(6);
        list.addToTail(-30);
        list.addToHead(100);
        System.out.println("Length: " + list.length());
        list.printList();
        list.remove(2);
        System.out.println("__________");
        System.out.println("Length: " + list.length());
        list.printList();



    }
    }
