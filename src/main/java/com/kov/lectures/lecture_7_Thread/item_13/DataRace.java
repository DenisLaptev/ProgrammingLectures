package com.kov.lectures.lecture_7_Thread.item_13;

/**
 * Created by Kovantonlenko on 12/7/2015.
 */
public class DataRace {
    public static void main(String[] args) {
        UserCounter counter = new UserCounter();
        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(counter);
        Thread thread3 = new Thread(counter);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class UserCounter implements Runnable {

    @Override
    public void run() {
        increment();
        increment();
        increment();
    }

    private void increment() {
//        synchronized (DataRace.class) {
            Counter.count++;
            System.out.println(Counter.count + " ");
//        }
    }
}

class Counter {
    public static long count = 0;
}