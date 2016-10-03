package com.kov.lectures.lecture_7_Thread.item_5;

/**
 * Created by Kovantonlenko on 12/4/2015.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int cycles = 0; cycles < 5; cycles++) {
            /*
            Если добавить sleep(3000), то потоки сильнее перепутаются.
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */

            System.out.println("?" + Thread.currentThread().getName() + Thread.currentThread());

            /*
            Thread.currentThread().getName()
            выдаёт имя потока, например Thread-1;

            Thread.currentThread()
            выдаёт [имя потока, приоритет, (и ещё что-то?)]
            */
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());

        t1.start();
        t2.start();
    }
}
