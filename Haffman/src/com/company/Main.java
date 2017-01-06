package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static int a,m1,m2 = 2;
    static LinkedList<Data> nodes = new LinkedList<Data>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	// write your code here
        System.out.println("How many messages? ");
        m1 = scanner.nextInt();
        try {
            initNodes(nodes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(nodes);
        mkTree(nodes);
    }
    public static void mkTree(LinkedList<Data> nodes){
        System.out.println(calcN0(m1, m2));

    }

    private static int calcN0(int m1,int m2) {
        for (int n0 = 2; n0 <= m2; n0++) {
            if((m1 - n0)%(m2 - 1) == 0)
                return n0;
        }
        return -1;
    }


    public static void initNodes(LinkedList<Data> datas) throws IOException {
        String message="";
        float probability;


        for(int i = 0;i <= m1-1;i++){
            Scanner scanner = new Scanner(System.in);
            boolean f = false;
            System.out.println("Enter message " + i);
            if (scanner.hasNextLine()) {
                message = scanner.nextLine();
            }

            do {
                System.out.println("Enter probability " + i);
                if (scanner.hasNextFloat()) {
                    probability = scanner.nextFloat();
                    datas.add(new Data(message, probability));
                    f = true;

                }
                else {
                    System.err.println("Wrong value");
                    scanner.next();
                }
            }while (f == false);

        }
    }
}
