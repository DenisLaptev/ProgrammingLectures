package com.kov.lectures.lecture_7_Thread.item_4;

/**
 * Created by Kovantonlenko on 12/4/2015.
 */
public class MyThread3 implements Runnable {
    @Override
    public void run(){
        System.out.println("In run method Thread's name is: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread3());
        thread.run();
        //Если мы не вызвали метод .start(), то thread будет всё тот же с именем main.
        System.out.println("In main method Thread's name is: " + Thread.currentThread().getName());
    }
}
