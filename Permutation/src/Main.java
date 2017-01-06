/**
 * Created by User on 29.07.2015.
 */
public class Main {

    public static void main(String...args){
        System.out.println(permutate(5, 0));

    }

    private static long permutate(long total, long noChange) {
       return fact(total-noChange);
    }

    private static long fact(long num) {
        if(num == 1){
            return 1;
        }
        else
            return fact(num-1)*num;

    }
}
