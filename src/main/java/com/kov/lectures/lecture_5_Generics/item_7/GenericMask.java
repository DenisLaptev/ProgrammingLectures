package com.kov.lectures.lecture_5_Generics.item_7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kovantonlenko on 10/18/2015.
 */
public class GenericMask {
    static void printList(List<?> list) {
        for (Object l : list) {
//            Integer b = (Integer) l;
            System.out.println("{" + l + "}");
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        printList(list);

        List<String> strList = new ArrayList<>();
        strList.add("one");
        strList.add("two");

        printList(strList);

    }
}
