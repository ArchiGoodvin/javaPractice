package com.company;

import java.util.LinkedList;

public class Main {
   public static long startTime;
    public static long finishTime;

    public static boolean interruptedStatus = false;

    private static final int NUM_OF_THREADS = 4;

    public static void main(String[] args) throws InterruptedException {
   int[] array0 = new int[10];
        int[] array1 = new int[10];
     MyRunnable run1 = new MyRunnable(1, 2);
        MyRunnable run2 = new MyRunnable(1, 2);



       Thread exclamSign = new Thread(new Runnable() {

           @Override
           public void run() {
               while (!interruptedStatus){


                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       System.out.println("Is interrupted: "+Thread.currentThread().isInterrupted());
                       break;
                   }
                   System.out.println("!");
           }
}
       });
        exclamSign.start();
        System.out.println(exclamSign.isInterrupted());
        Thread.sleep(1000);
        interruptedStatus = true;
        LinkedList



}


}
