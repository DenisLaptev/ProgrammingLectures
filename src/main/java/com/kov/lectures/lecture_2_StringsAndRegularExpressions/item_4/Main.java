package com.kov.lectures.lecture_2_StringsAndRegularExpressions.item_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kovantonlenko on 11/2/2015.
 */
public class Main {
    public static void main(String[] args) {
        String s = "The world is mine";
        String s1 = "test";
        String s2 = new String();

        String name = s.substring(4, s.length()-8);
        String name1 = s.substring(4, 9);
        System.out.println("length = " + s.length());
        System.out.println(name); // �� ������� ������� "world"
        System.out.println(name1); // �� ������� ������� "world"

        String domain = s.substring(s.length());
        System.out.println(domain); // подстрока, начиная с N+1 буквы. Получим пустую строку.

        String substring = s1.substring(4);
//      System.out.println(s.substring(4));
        System.out.println(substring.equals(""));

        System.out.println(substring);//подстрока, начиная с N+1 буквы. Получим пустую строку.


    }
}
