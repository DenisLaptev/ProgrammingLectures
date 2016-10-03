package com.kov.lectures.lecture_6_IO.item_1;

import java.io.*;
import java.nio.file.*;

/**
 * Created by Kovantonlenko on 11/30/2015.
 */
public class MyReader {
    public static void main(String[] args) {

        //File file = new File("C:\\Users\\lapte\\IdeaProjects\\ProgrammingLectures\\src\\main\\java\\com\\kov\\lectures\\lecture_6_IO\\item_1\\example.txt");
        File file = new File("src\\main\\java\\com\\kov\\lectures\\lecture_6_IO\\item_1\\example.txt");

        try (Reader inputStream = new FileReader(file)) {
            int val;

            while ((val = inputStream.read()) != -1) {
                System.out.println((char) val);
            }
            System.out.println("file.getAbsolutePath(): ");
            System.out.println(file.getAbsolutePath());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("file.getPath(): ");
            System.out.println(file.getPath());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("file.getCanonicalPath(): ");
            System.out.println(file.getCanonicalPath());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        } catch (FileNotFoundException e) {
            System.out.println("Can not find current file");
        } catch (IOException e) {
            System.out.println("error when processing file");
        }

    }
}
