package com.kov.lectures.lecture_1_AdvancedClasses.item1_3;

/**
 * Created by lapte on 11.08.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        MyInterface myInterface = new A();
        Comparable comparable = new A();

        myInterface.doSomeWork();
    }
}
