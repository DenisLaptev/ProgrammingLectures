package com.kov.lectures.lecture_4_Collection.item_13;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Kovantonlenko on 11/16/2015.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("B", "testB");
        treeMap.put("D", "testD");
        treeMap.put("A", "testA");
        treeMap.put("C", "testC");

        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
