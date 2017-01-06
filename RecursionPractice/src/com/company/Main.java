package com.company;

public class Main {
    private static final int k = 5, m = 10;

    public static void main(String[] args) {
power2(17);

    }

    private static void recursion1(int k){
        if(k == 0){
            return;
        }
        else
            recursion1(k - 1);
        System.out.println(k);
        return;
    }
    private static void recursion2(int a, int b) {
        if (a == b) {
            System.out.println(a);
            return;
        }
       else if (a < b) {
            System.out.println(a);
            recursion2(a + 1, b);

    }
        else {
            System.out.println(a);
            recursion2(a - 1, b);

        }
    }

    private static void power2(float number){
        if(number < 2) {
            System.out.println("NO");
            return;
        }
        else if(number == 2){
            System.out.println("YES");
            return;

        }
        else
            power2(number/2);

    }

}
