package com.kov.lectures.lecture_7_Thread.item_11;

/**
 * Created by Kovantonlenko on 12/5/2015.
 */

class T extends Thread {
    @Override
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("Start daemon thread");
                sleep(10000);
                System.out.println("Demon wakes up");
            } else {
                System.out.println("Start usual thread");
                sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (isDaemon()) {
                System.out.println("End daemon thread ");
            } else {
                System.out.println("End usual thread");
            }
        }
    }
}

public class DemoDaemonThread {
    public static void main(String[] args) throws InterruptedException {
        T usual = new T();
        T daemon = new T();

        daemon.setDaemon(true);
        daemon.start();
        usual.start();
        Thread.sleep(4000);
        System.out.println("Last main operator");
    }
}
