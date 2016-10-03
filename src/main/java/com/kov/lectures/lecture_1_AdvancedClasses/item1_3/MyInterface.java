package com.kov.lectures.lecture_1_AdvancedClasses.item1_3;


interface MyInterface {
    String text = "some text"; // ��� ���� �� ��������� ����� ������������ public final

    void doSomeWork(); // ����� �� ��������� ����� ����������� public abstract
}

class A implements MyInterface, Comparable {

    public void doSomeWork() { //����� ������ ���� ����������
        System.out.println("Class A has some work");
//        this.text = "can not change it!";  //���������� �������� ���� text



    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
