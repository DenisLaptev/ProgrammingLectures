package com.kov.lectures.lecture_5_Generics.item_10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kovantonlenko on 10/18/2015.
 */
public class GenericMascSuper {
    public static void main(String[] args) {

        List<Child> children = new ArrayList<>();
        List<Parent> parents = new ArrayList<>();
        List<SuperParent> superParents = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

//        showInfo1(children); // ������ ����������
        showInfo1(parents);
        showInfo1(superParents);
        showInfo1(objects);

        showInfo2(children);
        showInfo2(parents);
//        showInfo2(superParents); // ������ ����������
//        showInfo2(objects); // ������ ����������

        List<? extends Parent> list = new ArrayList<Child>();

//        list.add(new Child()); //������ ����������
//        Parent parent = list.get(0);

        List<? super Child> list1 = new ArrayList<Child>();

        list1.add(new Child());
        Object o = list1.get(0);
    }

    private static void showInfo1(List<? super Parent> listParam) {
        listParam.add(new Child());
        listParam.add(new Parent());
//        listParam.add(new SuperParent()); // ������ ����������
//        listParam.add(new Object()); // ������ ����������

        Object o = listParam.get(0);
    }

    private static void showInfo2(List<? extends Parent> list) {
        /*list.add(new Child());  // ������ ����������
        list.add(new Parent()); // ������ ����������
        list.add(new Object()); // ������ ����������*/

//        Parent parent = list.get(0);
    }


}

class SuperParent {
}

class Parent extends SuperParent {
}

class Child extends Parent {
}

class Child2 extends Parent {
}
