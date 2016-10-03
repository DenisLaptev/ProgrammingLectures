package com.kov.lectures.lecture_7_Thread.item_8;

/**
 * Created by Kovantonlenko on 12/4/2015.
 */
public class TimeBomb extends Thread {
    String[] timeStr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    @Override
    public void run() {
        for (int i = 9; i >= 0; i--) {
            System.out.println(timeStr[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TimeBomb timer = new TimeBomb();
        System.out.println("Starting 10 second count down. . .");
        timer.start();

        System.out.println("BABAX!!!");
    }
}
