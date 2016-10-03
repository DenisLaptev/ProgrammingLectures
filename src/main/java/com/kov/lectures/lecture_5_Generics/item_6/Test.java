package com.kov.lectures.lecture_5_Generics.item_6;

import java.util.ArrayList;
import java.util.List;

import static com.kov.lectures.lecture_5_Generics.item_6.Utilities.fill;

class Utilities {
    public static <T> T fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++)
            list.set(i, val);
        return val;
    }

}

class Test {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        System.out.println("before " + intList);

        Integer fill = fill(intList, 0);

        List<String> intList2 = new ArrayList<>();
        String fill1 = fill(intList2, "");

//        Utilities.fill(intList, "str"); //ошибка компиляции, т.к. список целых чисел
//                                          попытались заполнить строками.
        System.out.println("after " + intList);
    }
}
