package com.company.lib;

/**
 * Created by User on 22.07.2015.
 */
public class Massivy {
    public static int binarySearch(int[] array, int k){ //returns the index of the element
        int leftBorder = 0;
        int rightBorder = array.length-1;
        int middle = 0;
        if(k==array[leftBorder])
            return leftBorder;
        else if(k==array[rightBorder])
            return rightBorder;
        while(leftBorder!=rightBorder){
            middle = leftBorder+(rightBorder-leftBorder)/2;
            if (array[middle] == k) {
                break;
            }
            else if(k>array[middle]){
                if(rightBorder-middle==1)
                    return -1;

                leftBorder = middle;
            }
            else {
                if (middle - leftBorder == 1)
                    return -1;

                rightBorder = middle;
            }

        }
        if(array[middle]==k)
            return middle;
        else
            return -1;
    }

    public static void buubleSortMax(int[] array){
        for (int barrier = array.length - 1; barrier >= 0; barrier--) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i);
                }

            }
        }
    }

    public static void buubleSortMin(int[] array) {

        for (int barrier = 0;barrier<=array.length-1;barrier++) {
            for (int i = array.length - 1; i >= 1; i--) {
                if (array[i] < array[i - 1]) {
                 //   swap(array, i - 1);
                }
            }
        }
    }

    public static void swap(int[] array, int k){
        int temp;
        temp = array[k];
        array[k] = array[k+1];
        array[k+1]=temp;
    }


    //public static void invert(int[] array){
       // for(int i = 0;i<array.length/2;i++){
           // swap(array, i, array.length-i-1);

       // }

   // }

}
