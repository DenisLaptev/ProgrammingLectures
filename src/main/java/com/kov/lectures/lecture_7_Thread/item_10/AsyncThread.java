package com.kov.lectures.lecture_7_Thread.item_10;

/**
 * Created by Kovantonlenko on 12/4/2015.
 */
public class AsyncThread extends Thread {
    //Класс демонстрирует работу несинхронизированных thread-ов.
    @Override
    public void run() {
        System.out.println("Starting the thread " + Thread.currentThread().getName());
        for (int i = 0; i < 3; i++) {
            System.out.println("In thread " + Thread.currentThread().getName() + "; iteration " + i);
            try {
                //�������� ����� ��������� ���������
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        AsyncThread asyncThread1 = new AsyncThread();
        AsyncThread asyncThread2 = new AsyncThread();
       // �������� ��� ������
        asyncThread1.start();
        asyncThread2.start();
    }
}
