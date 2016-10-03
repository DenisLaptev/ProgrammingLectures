package com.kov.lectures.lecture_7_Thread.item_1;

/**
 * Created by Kovantonlenko on 12/4/2015.
 */
public class MyThread1 extends Thread{
    @Override
    public void run() {
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //две аналогичные строчки.
        System.out.println("In run method Thread's name is: " + Thread.currentThread().getName());
        System.out.println("In run method Thread's name is: " + this.getName());
    }

    public static void main(String[] args) {

        MyThread1 thread = new MyThread1();
        thread.start();

        System.out.println("In main method Thread's name is: " + Thread.currentThread().getName());
    }
}
