package com.kov.lectures.lecture_4_Collection.item_5;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Kovantonlenko on 11/13/2015.
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        String palStr = "abcbad";
        List<Character> palindrome = new LinkedList<>();
        for (char ch : palStr.toCharArray()) {
            palindrome.add(ch);
        }
        System.out.println("Input string is " + palStr);

        ListIterator<Character> iterator = palindrome.listIterator();
        ListIterator<Character> revIterator = palindrome.listIterator(palindrome.size());

        boolean result = true;

        while (revIterator.hasPrevious() && iterator.hasNext()) {
            if (iterator.next() != revIterator.previous()) {
                result = false;
                break;
            }
        }

        if (result) {
            System.out.println("Input string is a palindrome");
        } else {
            System.out.println("Input string is not a palindrome");
        }
    }
}
