package com.kov.lectures.lecture_5_Generics.item_11;

/**
 * Created by Kovantonlenko on 3/9/2016.
 */
public class InheritanceGeneric {
    public static void main(String[] args) {
        Child child = new Child(2);
//        Child wrongChild = new Child("test"); //������ ����������
        Child2 child2 = new Child2("hello");

        System.out.println("Child with Integer generic " + child.doSome());
        System.out.println("Child with String generic " + child2.doSome());
    }
}

class Parent<T> {
    protected T field;

    public Parent(T field) {
        this.field = field;
    }

    public T doSome() {
        return field;
    }
}

class Child extends Parent<Integer> {

    public Child(Integer field) {
        super(field);
    }
}

class Child2 extends Parent<String> {

    public Child2(String field) {
        super(field);
    }
}
