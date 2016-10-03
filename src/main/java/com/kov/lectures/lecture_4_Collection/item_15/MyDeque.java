package com.kov.lectures.lecture_4_Collection.item_15;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Kovantonlenko on 11/17/2015.
 */
public class MyDeque {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("1");
        deque.add("2");
        deque.add("3");
        deque.add("4");


        deque.addFirst("0");
        deque.addLast("5");
        System.out.println(deque);

        // ��� ������ ���������� ������ Queue ������ ������������ �� ��� ������� �������

    }
}
