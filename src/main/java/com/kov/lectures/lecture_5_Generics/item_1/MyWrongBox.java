package com.kov.lectures.lecture_5_Generics.item_1;

/**
 * Created by Kovantonlenko on 10/17/2015.
 */
public class MyWrongBox {

    private Object field;

    public MyWrongBox(Object field) {
        this.field = field;
    }

    public void getTypeInfo(){
        System.out.println("The field type is " + field.getClass().getName());
    }

    public Object getField() {
        return field;
    }

    @Override
    public String toString() {
        return "MyWrongBox{" +
                "field=" + field +
                '}';
    }

}


class Main {
    public static void main(String[] args) {

        MyWrongBox box1 = new MyWrongBox("first item");
        MyWrongBox box2 = new MyWrongBox(100);


        String field1 = (String) box1.getField(); // ��� ������ ����������
        Integer field2 = (Integer) box2.getField(); // ��� ������ ����������

//        Integer field3 = (Integer) box1.getField();// ��� ������ ����������, �� ��������� ������ ���������� java.lang.ClassCastException

        Object field4 = box1.getField(); //  ��� ������ ����������

        box1.getTypeInfo();
        box2.getTypeInfo();
//        field4.getTypeInfo(); // ������ ����������, � ������ Object ��� ������ getTypeInfo()

        System.out.println(box1);
        System.out.println(box2);

    }
}
