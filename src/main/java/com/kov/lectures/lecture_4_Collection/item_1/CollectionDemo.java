package com.kov.lectures.lecture_4_Collection.item_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Kovantonlenko on 11/13/2015.
 */
public class CollectionDemo {

    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(c);

        System.out.println(c.size()); // 5
        System.out.println(c.isEmpty()); // false
        System.out.println(c.contains(4)); // true

        c.add(6);
        System.out.println(c); // [1, 2, 3, 4, 5, 6]
        c.remove(1);
        System.out.println(c); // [2, 3, 4, 5, 6]
        Collection<Integer> c1 = new ArrayList<>(Arrays.asList(3, 4));
        System.out.println(c.containsAll(c1));// true
        c.addAll(c1);
        System.out.println(c); // [2, 3, 4, 5, 6, 3, 4]
        Collection<Integer> c2 = new ArrayList<>(c); // �����
        c.removeAll(c1);
        System.out.println(c); // [2, 5, 6]
        c2.retainAll(c1);
        System.out.println(c2); // [3, 4, 3, 4]
        c.clear();
        System.out.println(c); // []
    }
}