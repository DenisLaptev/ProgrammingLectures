package com.kov.lectures.lecture_7_Thread.item_7;

/**
 * Created by Kovantonlenko on 12/4/2015.
 */
public class SimpleThread {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        System.out.println(t1);

        Thread t = new Thread();
        t.setName("SimpleThread");
        t.setPriority(9);
        System.out.println(t);

    }
}
