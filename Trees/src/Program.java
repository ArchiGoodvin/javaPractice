import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User on 21.07.2015.
 */
public class Program {
    File file;
    Scanner scanner;
    public static int allTrees,leftTrees;
    int nums[] = new int[2];
    int counter;
   int[] leftTreesPosition;
    public static void main(String... args){
        long startTime = System.currentTimeMillis();
        new Program().allActions();
        long finishTime = System.currentTimeMillis();
        System.out.println("Time "+(finishTime-startTime));
    }

    private void allActions() {
        readData();
     process();
        output();
    }

    private void output() {
        System.out.println(counter);
    }

    private void process() {
        switch (leftTrees){
            case 0:
                counter=1;
                break;
            default:
                leftTreesPosition = new int[leftTrees];
                startMassInit();
                while ((leftTreesPosition[0] == 0) && ((leftTreesPosition[leftTrees-1]<allTrees))) {
                    checkLine();
                    expandSpaceBtwTrees();
                }
                break;

        }



    }

    private void expandSpaceBtwTrees() {
       /* for(int i = 2;i<leftTrees;i++){
            leftTreesPosition[1]++;
            int difference = leftTreesPosition[1];
            leftTreesPosition[i] = leftTreesPosition[i-1]+difference;  }*/

        for(int i = 0;i<leftTrees;i++){
            leftTreesPosition[i]=leftTreesPosition[i]+i;
        }



    }

    private void startMassInit() {

        for(int i = 0;i<leftTrees;i++){
            leftTreesPosition[i]=i;

        }
    }
    private void checkLine() {
        counter += allTrees-leftTreesPosition[leftTreesPosition.length-1];
    }

    private void readData() {
        file = new File("src/INPUT.txt");
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
            e.printStackTrace();
        }
        int i = 0;
        while (scanner.hasNext()){
            nums[i] =scanner.nextInt();
            i++;
        }
        scanner.close();
        allTrees = nums[0];
        leftTrees = nums[1];

    }
}
