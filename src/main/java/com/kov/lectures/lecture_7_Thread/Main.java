package com.kov.lectures.lecture_7_Thread;

/**
 * Created by Kovantonlenko on 12/7/2015.
 */
public class Main extends Thread {

    boolean flag = false;
    Test test;

    public Main(String name, boolean flag, Test test) {
        super(name);
        this.flag = flag;
        this.test = test;
    }

    @Override
    public void run() {

        if (flag) {
            try {
                test.first();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            try {
                test.second();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Test test = new Test();

        Thread main1 = new Main("main1", true, test);
        Thread main2 = new Main("main2", false, test);

        main1.start();
        main2.start();
    }
}

class Test {

    public void first() throws InterruptedException {
        synchronized (this) {
            System.out.println("fetch first");//(fetch - получать)
            Thread.sleep(2000);
            System.out.println("first");
        }
    }

    public synchronized void second() throws InterruptedException {
        synchronized (this) {
            System.out.println("fetch second");//(fetch - получать)
            Thread.sleep(2000);
            System.out.println("second");
        }
    }
}
