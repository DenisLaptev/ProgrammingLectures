package com.kov.lectures.lecture_4_Collection.item_14;

import java.util.*;

/**
 * Created by Kovantonlenko on 11/16/2015.
 */
public class MyQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");

        System.out.print(queue.poll() + " ");    // 1     Retrieves and removes the head of this queue
        System.out.print(queue.poll() + " ");    // 2     Retrieves and removes the head of this queue
        System.out.print(queue.poll() + " ");    // 3     Retrieves and removes the head of this queue

        System.out.println(queue);

    }
}
