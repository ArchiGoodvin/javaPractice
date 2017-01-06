/**
 * Created by User on 24.09.2015.
 */
public class Arr {
    private static int digitSwitcher;
    private static int[] result;
    public static int[] intToArrayInt(int num){
        String str = Integer.toString(num);
        int amount = str.length();
        int a;
        result = new int[amount];
        digitSwitcher = (int) Math.pow(10,amount-1);
        for(int i = 0; i < result.length;i++){
             a = (int) (num/(digitSwitcher/Math.pow(10,i)));
             result[i] = a - rest(i);
        }
        return result;

    }

   public static int rest(int summandAmount) {
        int sum = 0;
        for(int i = 0; i < summandAmount;i++){
            sum += result[i]*(Math.pow(10,summandAmount-i));
        }
        return sum;
    }
}
