package com.company;

import java.util.Arrays;
import com.company.lib.Massivy;

public class Main {


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int num = 30;

        Massivy mass = new Massivy();

        int[] array1 = {40, 30, 70, 50,-1, 10, 20};
        int[] array2 = {2000, 0 , 800, 27, -350000, 13, 450,87};

        int argument = 0;
        int a1 = 1;
        int a2 = 2;
        System.out.println(Arrays.toString(array1));
        swap(array1, 0, 1);
        System.out.println(Arrays.toString(array1));
        System.out.println("____________");
        System.out.println(a1);
        System.out.println(a2);
        f2(a1, a2);
        System.out.println(a1);
        System.out.println(a2);
        Integer




        long finishTime = System.currentTimeMillis();
        System.out.println("Time: " + (finishTime - startTime));

    }

    private static void binaryOutput(int[] array, int element) {
        int res = Massivy.binarySearch(array, element);
        switch (res){
            case -1:
                System.out.println("There is no element '"+element+"'");
                break;
            default:
                System.out.println("Index of element "+element+" is "+ res);
                break;
        }

    }

    private static void invert(int[] array) {
        for (int i = 0; i<array.length/2;i++){
            swap(array, i, array.length - 1 - i);

        }

    }

    private static void swap(int[] array, int first,int second) {
        int temp;
        temp = array[first];
        array[first]=array[second];
        array[second]=temp;


    }

    private static void shift(int[] array,int k){

        for (int i = 0; i<k;i++)
        {
            int temp = array[array.length-1];
            System.arraycopy(array, 0, array,1,array.length-1);
            array[0]=temp;
        }


    }

    private static int[] merge(int[] array1, int[] array2) {
        int[] result = new int[array1.length+array2.length];
        int array1Index = 0;
        int array2Index = 0;
        boolean lastActionWasWith1 = true;
        while(array1Index<array1.length && array2Index<array2.length) {

            if(array1[array1Index]<array2[array2Index]){
                result[array1Index+array2Index] = array1[array1Index];
                array1Index++;
                lastActionWasWith1 = true;
            }
            else {
                result[array1Index+array2Index] = array2[array2Index];
                array2Index++;
                lastActionWasWith1 = false;
            }

        }
        if(lastActionWasWith1 == false){

            System.arraycopy(array1, array1Index, result, array1Index + array2Index, array1.length - array1Index );
        }
        else if(lastActionWasWith1 == true){
            System.arraycopy(array2,array2Index,result,array1Index+array2Index,array2.length-array2Index );
        }

return result;
    }

    private static void f(int arg){
        System.out.println(arg);
        if(arg<7){
            f(arg + 1);


        }
        System.out.println(arg);

    }
    private static void f1(int arg){
        arg++;


    }
    private static void f2(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
    }


    }





