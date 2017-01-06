package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;

/**
 * Created by User on 26.09.2015.
 */
public class Processor {
    public static LinkedList<String> stringsArray = Main.stringsOfFile;
    public static void execute(String command, int m, int n){
        char charCommand = command.charAt(0);
        switch (charCommand){
            case 'D':
                for (int i = m; i <= m;i++){
                    stringsArray.remove(i);
                }
                break;
            case 'I':
                BufferedReader inKey = new BufferedReader(new InputStreamReader(System.in));
                try {
                    System.out.println("Enter the text to add: ");
                    String text = inKey.readLine();
                    if(text != null){
                        stringsArray.add(m+1,text);
                    }
                    else{
                        System.out.println("NO INPUT");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("WRONG COMMAND");
        }
    }
}
