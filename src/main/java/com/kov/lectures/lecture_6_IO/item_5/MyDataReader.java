package com.kov.lectures.lecture_6_IO.item_5;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Kovantonlenko on 11/30/2015.
 */
public class MyDataReader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\lapte\\IdeaProjects\\ProgrammingLectures\\target\\classes\\com\\kov\\lectures\\lecture_1_AdvancedClasses\\initOrder\\Init.class");

        int extension = 0xCAFEBABE;

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(file))) {
            while (true) {
                int specialSymbol = inputStream.readInt();
                if (specialSymbol == extension) {
                    System.out.println("This is a .class extension");
                }
            }

        } catch (EOFException e) {
            System.out.println("End of the file"); // EOF �������, ��� ������ � ����� ���������, � �� -1 ��� �� ������ ��� �����.
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}