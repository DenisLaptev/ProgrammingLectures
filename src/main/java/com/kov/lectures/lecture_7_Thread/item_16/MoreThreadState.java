package com.kov.lectures.lecture_7_Thread.item_16;

/**
 * Created by Kovantonlenko on 12/7/2015.
 */
public class MoreThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new SleepyThread();
        Thread t2 = new SleepyThread();
        t1.start();
        t2.start();
        Thread.sleep(500); // ����� ��� ��������� ��������� ������
        //не понятно, зачем нужна строка выше.
        System.out.println(t1.getName() + ": I'm in state " + t1.getState());
        System.out.println(t2.getName() + ": I'm in state " + t2.getState());
    }
}

class SleepyThread extends Thread {
    @Override
    public void run() {
        synchronized (SleepyThread.class) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}