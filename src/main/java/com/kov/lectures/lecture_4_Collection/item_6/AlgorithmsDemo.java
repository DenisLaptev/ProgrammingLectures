package com.kov.lectures.lecture_4_Collection.item_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Kovantonlenko on 11/13/2015.
 */
public class AlgorithmsDemo {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(0, 1, 2, 3, 3, -4);
        System.out.println(Collections.max(a)); // 3
        System.out.println(Collections.min(a)); // -4
        System.out.println(Collections.frequency(a, 2)); // 1 ���
        System.out.println(Collections.frequency(a, 3)); // 2 ����

        Collections.reverse(a);   // ������ ������� ��������� �� ���������������
        System.out.println(a);    // [-4, 3, 3, 2, 1, 0]

        Collections.rotate(a, 3); // �������� ������ ���������� �� 3 ��������
        System.out.println(a);    // [2, 1, 0, -4, 3, 3]
/*

        Collections.rotate(a, 2); // �������� ������ ���������� �� 3 ��������
        System.out.println(a);    // [3, 3, 2, 1, 0, -4]

*/
        List<Integer> sublist = Collections.nCopies(2, 3); // 3 3
        System.out.println(Collections.indexOfSubList(a, sublist)); // 4

        // Класс Collections имеет алгоритм shuffle,
        // который выполняет противоположную сортировке задачу:
        // случайным образом изменяет порядок элементов в списке.

        Collections.shuffle(a);
        System.out.println("shuffle " + a);    // �������� � ������������ �������

        Collections.sort(a);
        System.out.println(a);    // [-4, 0, 1, 2, 3, 3]

        List<Integer> b = new ArrayList<Integer>(a);
        Collections.fill(b, 8);
        System.out.println(b);    // [8, 8, 8, 8, 8, 8]

        Collections.copy(b, a);
        System.out.println(b);    // [-4, 0, 1, 2, 3, 3]
        System.out.println(Collections.binarySearch(b, 2)); // 3

        Collections.swap(b, 0, 5); // поменять местами элементы.
        System.out.println(b);    // [3, 0, 1, 2, 3, -4]

        Collections.replaceAll(b, 3, 10);// заменить.
        System.out.println(b);    // [10, 0, 1, 2, 10, -4]
    }
}