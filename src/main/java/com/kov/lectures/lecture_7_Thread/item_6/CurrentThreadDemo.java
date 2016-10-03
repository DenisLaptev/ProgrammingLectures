package com.kov.lectures.lecture_7_Thread.item_6;

/**
 * Created by Kovantonlenko on 12/4/2015.
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        //вначале thread t имел имя main.

        System.out.println("Current thread: " + t);

        //change the name of the thread
        t.setName("My Thread");
        System.out.println("After name change: " + t);

        for (int n = 5; n > 0; n--) {
            System.out.println(n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
    }
}

