package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static final String FILE_PATH ="E:/MyFile.txt";
    public static final String KEY_WORD ="Hello";
    public static void main(String[] args) {
        String str;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(FILE_PATH)));
            str = reader.readLine();
            while (str != null) {
                if (containsKeyWord(KEY_WORD, str)) {
                    System.out.println(str);
                }
                str = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean containsKeyWord(String key, String line) {
        return true;
    }


}
