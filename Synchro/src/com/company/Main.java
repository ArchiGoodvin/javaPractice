package com.company;

public class Main {
   static int counter;
    final static int N = 100000000;

    public static void main(String[] args) throws InterruptedException {
        final Object sync = new Object();
        Thread t1 =  new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < N; i++)
                    synchronized (sync) {
                        counter++;
                    }
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < N; i++)
                    synchronized (sync) {
                        counter++;
                    }
            }
        });
        t2.start();


        t1.join();
        t2.join();

        System.out.println(counter);

    }

    private void inc(){counter++;}

}
