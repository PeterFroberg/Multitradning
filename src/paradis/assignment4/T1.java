package paradis.assignment4;

public class T1 extends Thread {

    boolean running = true;

    @Override
    public void run() {
        super.run();
        while(running) {
            System.out.println("Tråd 1");
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
