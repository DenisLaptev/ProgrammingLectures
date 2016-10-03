package com.kov.lectures.lecture_7_Thread;

/**
 * Created by Kovantonlenko on 12/8/2015.
 */
public class StackThread extends Thread{

    public StackThread(String name) {
        super(name);
    }

    public static void main(String[] args) {
        StackThread thread1 = new StackThread("MyThread1");
        thread1.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        new StackThread("MyThread2").start();
        //при запуске потока создаётся новый поток, он запускается и опять создаёт
        //новый поток. Так продолжается по циклу. Прокрама зацикливается.
    }
}
