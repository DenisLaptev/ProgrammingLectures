package com.kov.lectures.lecture_4_Collection.item_11;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kovantonlenko on 11/16/2015.
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "test2");
        map.put(7, "test7");
        map.put(11, "test22");
        map.put(65, "test65");
       /* for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key is " + entry.getKey() + ", value is " + entry.getValue());
        }*/

       /* for (Integer key : map.keySet()) {
            System.out.println("Key is " + key + ", values is " + map.get(key));
        }*/

        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}
