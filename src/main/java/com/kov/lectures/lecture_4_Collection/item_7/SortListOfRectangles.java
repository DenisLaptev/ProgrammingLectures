package com.kov.lectures.lecture_4_Collection.item_7;

import java.util.*;

/**
 * Created by Kovantonlenko on 11/13/2015.
 */
class SortListOfRectangles {
    public static void main(String[] args) {
        List<Rectangle> list = new ArrayList<>();
        list.add(new Rectangle(2, 7));
        list.add(new Rectangle(5, 3));
        list.add(new Rectangle(3, 4));
        Collections.sort(list, new CompareByArea());
        System.out.println(list);
    }
}

class SortArrayOfRectangles {
    public static void main(String[] args) {
        Rectangle[] a = {new Rectangle(2, 8), new Rectangle(5, 3), new Rectangle(3, 4)};
        Arrays.sort(a, new CompareByArea());
        System.out.println(Arrays.asList(a));
    }
}

class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public String toString() {
        return "[" + width + ", " + height + ", area = " + this.area() + "]";
    }
}

class CompareByArea implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        return Double.compare(r1.area(), r2.area());
    }
}
