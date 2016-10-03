package com.kov.lectures.lecture_4_Collection.item_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kovantonlenko on 11/13/2015.
 */
public class AutoBox {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(10);
        intList.add(123);

        int x = intList.get(0);

        Integer intObject = new Integer(1);
        int intPrimitive = 2;

        Integer tempInteger;
        int tempPrimitive;
        tempInteger = new Integer(intPrimitive);
        tempPrimitive = intObject.intValue();

        tempInteger = intPrimitive;
        tempPrimitive = intObject;
    }
}
