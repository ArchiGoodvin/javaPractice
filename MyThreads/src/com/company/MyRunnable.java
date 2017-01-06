package com.company;

/**
 * Created by User on 15.08.2015.
 */
public class MyRunnable implements Runnable{
    int from;
    int to;

    MyRunnable( int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello world");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}