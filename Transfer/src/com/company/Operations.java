package com.company;

public class Operations {

    public static void main(String[] args) throws InterruptedException {
       final Account a = new Account(1000);
        final Account b = new Account(2000);


       Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                transfer(a, b, 300);
            }
        });
        transfer(b, a, 500);
        thread.start();
        System.out.println("A: "+a.getBalance()+" B: "+b.getBalance());



    }

  static void transfer(Account acc1, Account acc2, int amount){
      synchronized (acc1) {
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          synchronized (acc2) {
              acc1.withdraw(amount);
              acc2.deposit(amount);
          }
      }

    }
}
