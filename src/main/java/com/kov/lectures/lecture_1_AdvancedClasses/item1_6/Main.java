package com.kov.lectures.lecture_1_AdvancedClasses.item1_6;

public class Main {
    public static void main(String[] args) {

    }
}

abstract class Parent { // ����������� ����� ����� �� ��������� �����������
    //�����

   /* abstract String ref; // ������ ����������

    abstract public Parent() { // ������ ����������
    }*/

     /*���������� � ������������ �� ����� ���� ������������*/


    public abstract void someMethod1(); // ����������� ����� �� ����� ����������

    public void someMethod2() { // ����������� ����� ����� ����� �� �����������
        // �����
    }
}

class Child extends Parent {

    public Child() {
    }

    @Override
    public void someMethod1() {// ��� ��� � ������ Parent ����� someMethod1 �
        // �����������,
        // �� � ����������� �� ������ ���� �������������,
        // ����� ������ ����������.

    }

   /* public abstract void someMethod3(); // ������ ����������,
    // ������ ������� ���������� ����� � ��
    // ����������� ������.*/
}
