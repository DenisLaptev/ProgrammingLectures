package com.kov.lectures.lecture_5_Generics.item_3;

/**
 * Created by Kovantonlenko on 10/17/2015.
 */
public class MyMultiGenericBox<A, B> {

    private A field1;
    private B field2;

    public MyMultiGenericBox(A val1, B val2) {
        this.field1 = val1;
        this.field2 = val2;
    }

    public A getField1() {
        return field1;
    }

    public B getField2() {
        return field2;
    }

    @Override
    public String toString() {
        return "MyMultiGenericBox{" +
                "field1=" + field1 +
                ", field2=" + field2 +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        MyMultiGenericBox<String, Integer> multiGenericBox =
                new MyMultiGenericBox<>("first arg", 100);


        String field1 = multiGenericBox.getField1();
        Integer field2 = multiGenericBox.getField2();

       /* MyMultiGenericBox<Boolean, Integer> multiGenericBox2 =
                new MyMultiGenericBox<> (true, 100);

        Boolean field12 = multiGenericBox2.getField1();
        Integer field22 = multiGenericBox2.getField2();
*/
        System.out.println(field1 + ", " + field2);
    }
}
