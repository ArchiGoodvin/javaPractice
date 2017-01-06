import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 18.07.2015.
 */
public class Program {
    Scanner sc;
    File f = new File("src/res/INPUT.txt");

    private String inputString;
    ArrayList<Character> charArray;
    String str;

    public static void main(String... args){new Program().allActions();}

    public void allActions()
    {
        input();
        output();

    }

    private void output() {
        mkArrayList();
        removeLast();
        System.out.println("The result is " + multiply() + "25");


    }

    private Integer multiply() {
        String createdString =  mkString(charArray);
        Integer result = Integer.valueOf(createdString);
        result = result*(result+1);
        return result;
    }

    private String mkString(ArrayList charArray) {
        for(int i = 0; i<(charArray.size());i++){
            if(str==null){
                str=String.valueOf(charArray.get(i));
            }
            else{
                str = str+charArray.get(i);
            }

        }
        return str;
    }

    private void removeLast() {
        charArray.remove(charArray.size() - 1);
        //System.out.println(charArray);
    }

    private void mkArrayList() {
       charArray = new ArrayList<Character>();
        for (int i = 0; i<inputString.length(); i++){
            charArray.add(inputString.charAt(i));
        }
       // System.out.println(charArray);
    }
public void input(){
    try {
        sc = new Scanner(f);
        while (sc.hasNext()){
            inputString = sc.next();
        }

    } catch (FileNotFoundException e) {
        System.out.println("File is not found");
        e.printStackTrace();
    }
    finally {
        sc.close();
    }

}
}
