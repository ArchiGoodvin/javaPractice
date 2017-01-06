package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static String currComLine;
    public static LinkedList<String> stringsOfFile = new LinkedList();
    public static void main(String[] args) {
          input();
        output();



    }

    private static void input() {
        String strOfFile = new String();
        String commandPath = "E://commands.txt";
        String filePath = "E://MyFile.txt";
        File fileFile = new File(filePath);
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(fileFile));
           strOfFile = fileReader.readLine();
            while(strOfFile!=null){
                stringsOfFile.add(strOfFile);
                strOfFile = fileReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("FILE IS NOT FOUND");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File commandFile = new File(commandPath);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(commandFile));
            currComLine = reader.readLine();
            while (currComLine != null) {
                executeComLine(currComLine);
                currComLine = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.err.println("COMMAND FILE NOT FOUND");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void executeComLine(String commandLine) {
    Scanner sc = new Scanner(commandLine).useDelimiter(",");
        String command = "N";
        int m = -1;
        int n = -1;
        for (int i = 0; i<3; i++){
            if(sc.hasNext()) {
                if (i == 0) {
                    command = sc.next();
                }
                else if (i == 1){
                    m = sc.nextInt();
                }
                else{
                    n = sc.nextInt();
                }
            }
        }
        Processor.execute(command,m,n);

    }
    private static void output() {
        System.out.println("END");
        System.out.println(stringsOfFile);
    }




}
