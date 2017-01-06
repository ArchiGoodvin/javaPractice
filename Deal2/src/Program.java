import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created by User on 04.07.2015.
 */
public class Program {
    public static void main(String[] args) throws InterruptedException {
        final Object obj = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("Wait...");
                    try {
                        obj.wait();
                        System.out.println("Awoke!");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();
        System.out.println("Sleep..");
        Thread.sleep(3000);
        synchronized (obj) {
            obj.notify();
        }
        }

    }

