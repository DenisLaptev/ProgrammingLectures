package com.kov.lectures.lecture_5_Generics.item_8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kovantonlenko on 10/18/2015.
 */
public class Test {

    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        doubleList.add(2.0);
        integerList.add(1);

        Number sumDouble = sum(doubleList);
        Number sumInteger = sum(integerList);

        System.out.println(sumDouble);
        System.out.println(sumInteger);

//        sum(new ArrayList<String>());// ������ ����������
    }

    public static Number sum(List<? extends Number> numList) {
        Double result = 0.0;
        for (Number num : numList) {
            result += num.doubleValue();
        }
        return result;
    }

}
