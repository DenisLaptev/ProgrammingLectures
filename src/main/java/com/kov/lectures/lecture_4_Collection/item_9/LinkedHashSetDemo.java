package com.kov.lectures.lecture_4_Collection.item_9;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Kovantonlenko on 11/16/2015.
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("B");
        stringSet.add("A");
        stringSet.add("A");
        stringSet.add("D");
        stringSet.add("E");
        stringSet.add("F");
        stringSet.add("A");
        System.out.println(stringSet);
    }
}
