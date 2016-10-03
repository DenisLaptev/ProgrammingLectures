package com.kov.lectures.lecture_4_Collection.item_2;

import java.util.ArrayList;

/**
 * Created by Kovantonlenko on 11/13/2015.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<String> languageString = new ArrayList<>();
        languageString.add("C");
        languageString.add("C++");
        languageString.add("Java");
        languageString.add(0, new String("Python"));

        System.out.println("First element is " + languageString.get(0));

        for (String language : languageString) {
            System.out.println(language);
        }
    }
}
