package paradis.assignment4;

import java.util.concurrent.TimeUnit;

public class Main {



    public static void main(String[] args) {
	    T1 t1 = new T1();
	    t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //TimeUnit.SECONDS.sleep(5);

        T2 t2 = new T2();
        Thread thread2 = new Thread(t2);
        thread2.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //

        t1.setRunning(false);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.setRunning(false);

    }
}
