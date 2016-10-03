package com.kov.lectures.lecture_7_Thread.Item_12;

/**
 * Created by Kovantonlenko on 12/5/2015.
 */
public class BasicThreadStates extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new BasicThreadStates());
        System.out.println(t);
        System.out.println("Just after creating thread; \n"
                + " The thread state is " + t.getState());

        t.start();

        System.out.println("Just after calling start; \n"
                + " The thread state is " + t.getState());

        t.join();

        System.out.println("Just after main calling t.join; \n"
                + " The thread state is " + t.getState());
    }
}
