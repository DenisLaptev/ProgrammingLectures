package com.kov.lectures.lecture_7_Thread.item_2;

/**
 * Created by Kovantonlenko on 12/4/2015.
 */
public class MyThread2 implements Runnable {
//public class MyThread2 extends Thread implements Runnable {
    @Override
    public void run() {
        System.out.println("In run method Thread's name is: " + Thread.currentThread().getName());
        //System.out.println("In run method Thread's name is: " + this.getName());
        //второй способ даст ошибку компиляции. Чтоб её исправить надо сделать
        //extends Thread
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(new MyThread2());
        myThread.start();
        System.out.println("In main method Thread's name is: " + Thread.currentThread().getName());
    }
}
