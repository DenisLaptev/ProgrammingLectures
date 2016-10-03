package com.kov.lectures.lecture_7_Thread.item_9;

import com.kov.lectures.lecture_7_Thread.item_8.TimeBomb;

/**
 * Created by Kovantonlenko on 12/4/2015.
 */
public class Main {
    public static void main(String[] args) {
        TimeBomb timer = new TimeBomb();
        System.out.println("Starting 10 second count down. . .");
        //timer.run();//так тоже получается без ошибок.
        timer.start();
        try {
            timer.join();//при этом, вначале выполняется обратный отчёт,
            // а после завершения выполнения обратного отчёта запускается команда взрыв.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("BABAX!!!");
    }
}
