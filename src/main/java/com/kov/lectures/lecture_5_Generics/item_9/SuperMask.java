package com.kov.lectures.lecture_5_Generics.item_9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kovantonlenko on 10/19/2015.
 */
public class SuperMask {
    public static void main(String[] args) {
        List<Parent> parents = new ArrayList<>();
        parents.add(new Parent());
        parents.add(new Child());

        test(parents);
    }

    private static void test(List<? super Parent> param) {
        Object o = param.get(0);
//        Parent parent = param.get(0); // ������ ����������
    }


}

class Parent {
}

class Child extends Parent {
}
