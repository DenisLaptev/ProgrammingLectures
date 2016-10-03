package com.kov.lectures.lecture_4_Collection.item_3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Kovantonlenko on 11/13/2015.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> languageList = new ArrayList<>();
        languageList.add("C");
        languageList.add("C++");
        languageList.add("Java");
        // Вывод на экран содержимого списка 3-мя способами.

       /*
       for (Iterator<String> languageIter = languageList.iterator(); languageIter.hasNext(); ) {
            String language = languageIter.next();
            System.out.println(language);
        }
        */


        /*
        Iterator<String> languageIter = languageList.iterator();
        while (languageIter.hasNext()){
            String language = languageIter.next();
            System.out.println(language);
        }
        */


        for (String s : languageList) {
            System.out.println(s);
        }
    }
}
