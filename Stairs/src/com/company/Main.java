package com.company;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;


public class Main {


   static byte[] mass = {'1','2','3','4','5'};
    static String input;

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

    }

    private static void readFromFile() {
        try {
            FileReader reader = new FileReader(new File("E:/INPUT.txt"));
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while( (line = bufferedReader.readLine()) != null)
                System.out.println(line);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
        }
    }

    private static void writeToFile() {
        try {

            FileWriter fw = new FileWriter(new File("E:/OUTPUT.txt"));
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write("Hello, darling!");
        } catch (IOException e) {
           System.err.println("Cannot write");
        }
    }
}