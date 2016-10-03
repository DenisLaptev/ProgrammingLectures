package com.kov.lectures.lecture_7_Thread.item_17;

/**
 * Created by Kovantonlenko on 12/7/2015.
 */
public class ThreadDemo implements Runnable {

    Thread t;

    public ThreadDemo(String str) {
        t = new Thread(this, str);
        t.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " yielding control...");
        Thread.yield();// (yield - уступать)
        System.out.println(Thread.currentThread().getName() + " has finished executing.");
    }

    public static void main(String[] args) {
        new ThreadDemo("Thread 1");
        new ThreadDemo("Thread 2");
        new ThreadDemo("Thread 3");
    }
}
