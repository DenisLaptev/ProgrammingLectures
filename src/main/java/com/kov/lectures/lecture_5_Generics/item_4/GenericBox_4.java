package com.kov.lectures.lecture_5_Generics.item_4;


public class GenericBox_4<T> {

    private T field1;
    private T field2;

    public GenericBox_4(T val1, T val2) {
        this.field1 = val1;
        this.field2 = val2;
    }

    public T getField1() {
        return field1;
    }

    public T getField2() {
        return field2;
    }

    @Override
    public String toString() {
        return "GenericBox_4{" +
                "field1=" + field1 +
                ", field2=" + field2 +
                '}';
    }
}

class Main {
    public static void main(String[] args) {

//        GenericBox_4<String> box1 = new GenericBox_4<String>("value", 100);// ������ ����������

        GenericBox_4<String> box2 = new GenericBox_4<>("value1", "value2");
        GenericBox_4<Integer> box3 = new GenericBox_4<>(100, 200);

        String field1 = box2.getField1();

        System.out.println(box2.getField1());
        System.out.println(box2.getField2());

    }
}
