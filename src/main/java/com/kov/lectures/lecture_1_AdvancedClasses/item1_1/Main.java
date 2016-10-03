package com.kov.lectures.lecture_1_AdvancedClasses.item1_1;

abstract class Parent {
    int p1;

    Parent() {
        System.out.println("Parent's constructor");
        p1 = 1;
    }

    void print() {
        System.out.println(p1);
    }


    abstract void test();
}
class Child extends Parent{

    public Child() {
        System.out.println("Child's constructor");
    }

    @Override
    void test() {
        System.out.println("child");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent;

//        parent = new Parent(); //ошибка������ ����������

        Parent child = new Child(); // ����� ������ ����������� �� ��������� �� A
        child.print();
        child.test();
    }
}


