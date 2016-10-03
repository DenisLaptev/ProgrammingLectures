package com.kov.lectures.lecture_5_Generics.item_2;

/**
 * Created by Kovantonlenko on 10/17/2015.
 */
public class MyGenericBox<T> {

    private T field;

    public MyGenericBox(T val) {
        this.field = val;
    }

    public void getTypeInfo() {
        System.out.println("The field type is " + field.getClass().getName());
    }

    public T getField() {
        return field;
    }

    @Override
    public String toString() {
        return "MyGenericBox{" +
                "field=" + field +
                '}';
    }

}

class Main {
    public static void main(String[] args) {

        MyGenericBox<String> box1 = new MyGenericBox<String>("first item");
        MyGenericBox<Integer> box2 = new MyGenericBox<Integer>(100);
//        MyGenericBox<Number> box3 = new MyGenericBox<Integer>(100); ������ ����������


        String field1 = box1.getField(); // ������ ������������� � ����� ����������
        Integer field2 = box2.getField(); // ������ ������������� � ����� ����������

//        Integer field3 = box1.getField();// ������ ����������, � ������� �� ����������� ������� ��� ���� ������ ���������� java.lang.ClassCastException.

        box1.getTypeInfo();
        box2.getTypeInfo();

        System.out.println(box1);
        System.out.println(box2);

    }
}