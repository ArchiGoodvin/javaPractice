/**
 * Created by User on 19.07.2015.
 */
public class Program {
    private int index = 9;
    private static int fn;
    private static int fn1;
    private static int fn2;

    public static void main(String... args){
        new Program().allActions();
    }

    public void allActions(){
        output();
    }

    private int process() {
        int[] nums = new int[index];
        nums[0]=0;
        nums[1]=1;
        fn1 = 1;
        fn2 = 0;
        fn =1;
        for (int i = 2;i<index;i++){
            fn2 = fn1;
            fn1= fn;
            fn = fn1+fn2;


        }
        return fn;
    }

    private void output() {
        System.out.println(process());
    }
}
