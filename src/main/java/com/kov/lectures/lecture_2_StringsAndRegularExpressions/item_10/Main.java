package com.kov.lectures.lecture_2_StringsAndRegularExpressions.item_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kovantonlenko on 11/2/2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(test("BACON"));      //true
        System.out.println(test("BACON "));     //false
        System.out.println(test("  BACON"));    //false
        System.out.println(test("BACON  "));    //false
        System.out.println(test("^BACON$"));    //false
        System.out.println(test("bacon"));      //false
    }

    public static boolean test(String testString) {
        //Следующий метод проверит строку на содержание в ней слова BACON и только!
    /*
        ^выражение  =  начало строки
        выражение$  =  конец строки

    */
        Pattern p = Pattern.compile("^BACON$"); // ������ ������ � ����� ������
        Matcher m = p.matcher(testString);
        return m.matches();
    }
}
