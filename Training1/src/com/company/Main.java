package com.company;

import java.io.*;
import java.util.*;

public class Main {
    static LinkedList<Integer> numbers = new LinkedList<Integer>();
    public static void main(String[] args) {
        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(new File("E:\\INPUT.txt")));
            try {
                while ((line = reader.readLine()) != null){
                    processLine(line);
                    System.out.println();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file");
            e.printStackTrace();
        }
        System.out.println(numbers);
    }

    private static void processLine(String string) {
        int a;
        Scanner scanner = new Scanner(string);
        while (scanner.hasNext()){
            System.out.print(" '" +(a = Integer.valueOf(scanner.next())) + "' ");
            numbers.add(a);
        }
    }
}
