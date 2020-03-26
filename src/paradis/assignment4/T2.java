package paradis.assignment4;

import java.util.concurrent.TimeUnit;

public class T2 implements Runnable{

    boolean running = true;

    @Override
    public void run() {
        while(running) {
            System.out.println("Tråd 2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setRunning(boolean running) {
        synchronized (this) {
            this.running = running;
        }
    }
}
