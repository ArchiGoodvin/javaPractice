/**
 * Created by User on 25.07.2015.
 */
public class Program {

    public static void main(String... args){
        System.out.println(calcFibonacci(15));


    }

    private static int calcFibonacci(int num){
        int result;
        if(num == 0){
            return 0;
        }
        else if (num == 1){
            return 1;
        }
        else
        System.out.println();
            result = calcFibonacci(num-2)+calcFibonacci(num-1);

            return result;
    }
}
