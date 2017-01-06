import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 * Created by User on 05.07.2015.
 */
public class Program {
    File file = new File("f.txt");
    List<String> lines = new ArrayList<String>();
    char[] characters;
    List<String> checkedLines;
    char[] KEYWORD = {'o','n','e'};


    public static void main(String... args){
        new Program().allActions();


    }

    public void allActions(){
        inputLines();
        processLines();
        outputLines();

    }

    private void outputLines() {
        for (String i:checkedLines){
            System.out.println(i);
        }
    }

    private void inputLines() {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                lines.add(scanner.nextLine());

            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
   private void processLines(){
       checkedLines = new ArrayList<String>();
       for (String i:lines){
          checkLine(i);

       }

   }

    private void checkLine(String i) {
        characters = i.toCharArray();
        for(int m = 0;m<(characters.length-KEYWORD.length+1);m++){
          if(createStringFromLittleArray(m)==String.valueOf(KEYWORD)){
              checkedLines.add(i);
          }
        }
    }
    private String createStringFromLittleArray(int m){
        String value = null;
       for (int i = 0; i<KEYWORD.length;i++){
           value+=characters[m+i];
       }
        return value;

    }

}
