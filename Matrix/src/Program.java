import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by User on 05.07.2015.
 */
public class Program {

    public static int cellNum;
    public static int leftBorder;
    public static int rightBorder;
    public static String[][] matrix;

    public static void main(String... args) {

        input();
        do {
            process();
            output();
            System.out.println("Type '-1' to exit");
            input();
        }while (cellNum != -1);

    }
    public  static void input(){
System.out.print("Enter the number of cells: ");
        Scanner scan = new Scanner(System.in);
        cellNum = Integer.parseInt(scan.next());

   }

    public static void process(){
        matrix = new String[cellNum][cellNum];
        leftBorder = 0;
        rightBorder = matrix.length-1;
        for (int i = 0; i<matrix.length; i++){

            for (int j = 0; j<matrix[i].length;j++){
                if(j>=leftBorder && j <= rightBorder){
                    matrix[i][j] = "1";
                }
                else if (j<=leftBorder &&j >= rightBorder)
                    matrix[i][j] = "1";
                else
                    matrix[i][j] = " ";


            }
            leftBorder++;
            rightBorder = rightBorder-1;

        }

    }
    public static void output(){
        System.out.println("==========================");
        System.out.println("==========================");
        for (int i = 0; i<matrix.length; i++){

            for (int j = 0; j<matrix[i].length;j++){
                System.out.print(" "+matrix[i][j]);

            }
            System.out.println();
        }
        System.out.println("==========================");
        System.out.println("==========================");
    }


    }
