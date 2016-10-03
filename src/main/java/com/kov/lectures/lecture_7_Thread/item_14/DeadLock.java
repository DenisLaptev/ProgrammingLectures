package com.kov.lectures.lecture_7_Thread.item_14;

/**
 * Created by Kovantonlenko on 12/7/2015.
 */
public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();

        System.out.println("Waiting for thread ");

        t1.join();
        t2.join();

        System.out.println("Done");
    }
}

class Counter implements Runnable {
    @Override
    public void run() {
        try {
            incrementBallAfterRun();
            incrementRunAfterBall();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void incrementBallAfterRun() throws InterruptedException {
        synchronized (Runs.class) {
//            Thread.sleep(100);
            synchronized (Balls.class) {
                Runs.runs++;
                Balls.balls++;
            }
        }
    }

    public void incrementRunAfterBall() {
        synchronized (Balls.class) {
            synchronized (Runs.class) {
                Balls.balls++;
                Runs.runs++;
            }
        }
    }
}

class Balls {
    public static long balls = 0;
}

class Runs {
    public static long runs = 0;
}


