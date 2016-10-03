package com.kov.lectures.lecture_7_Thread.Item_3;

/**
 * Created by Kovantonlenko on 12/4/2015.
 */
public class Test {
    public static void main(String[] args) {
        Thread threadX = new ThreadX();
        Thread threadY = new ThreadY();
        //�������� ��� ������
        threadX.start();
        threadY.start();
    }
}

class ThreadX extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.print("X");
        }
    }
}

class ThreadY extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Y");
        }
    }
}
