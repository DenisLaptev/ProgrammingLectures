package com.kov.lectures.lecture_5_Generics.item_5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Kovantonlenko on 10/18/2015.
 */
public class SimpleType {
    public static void main(String[] args) {

        example1();
        example2();

    }

    private static void example1() {
        List list = new LinkedList();
        list.add("First");
        list.add("Second");
//        list.add(10);
        list.add("10");

        List<String> list2 = list;

//        String s = list2.get(2); // java.lang.Integer cannot be cast to java.lang.String

        for (Iterator<String> itemItr = list2.iterator(); itemItr.hasNext(); ) {
            System.out.println(itemItr.next()); // java.lang.Integer cannot be cast to java.lang.String
        }
    }

    private static void example2() {
        List<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
//        list.add(10);//сразу подчеркнёт красным.

        List list2 = list;

        Object o = (String) list2.get(0);

        for (Iterator<String> itemItr = list2.iterator(); itemItr.hasNext(); ) {
            System.out.println(itemItr.next());
        }
    }

}
