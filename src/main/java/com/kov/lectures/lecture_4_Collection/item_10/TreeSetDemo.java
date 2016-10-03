package com.kov.lectures.lecture_4_Collection.item_10;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Kovantonlenko on 11/16/2015.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        String sentence = "My cat is a little";
        Set<Character> chars = new TreeSet<>();
        for (char val : sentence.toCharArray()) {
            chars.add(val);
        }
        System.out.println("My sorted chars -> " + chars);

    }
}
