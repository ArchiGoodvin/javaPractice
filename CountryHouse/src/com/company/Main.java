package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int result = 0;
    static int sum = 99;
    static int rest = sum;
    static int currentNominal;
   static ArrayList<Integer> output = new ArrayList<Integer>();

    static int[] nominals = {1,3,5,7,12,32};
    public static void main(String[] args){
       while (true) {
           currentNominal = nominalOf(rest);
           if (currentNominal == -1) {
               if(rest != 0)
                   System.out.println("Impossible");
               else
                   System.out.println(Arrays.toString(output.toArray()));
               return;
           } else {
               output.add(currentNominal);
               rest = rest - currentNominal;


           }
       }
    }
    public static int nominalOf(int value){
        int i = nominals.length-1;

      while(true){
          if (i == -1)
              return -1;

            if(value >= nominals[i])
                return nominals[i];

         else
            i--;
        }

    }


}
