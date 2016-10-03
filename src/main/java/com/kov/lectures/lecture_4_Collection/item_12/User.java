package com.kov.lectures.lecture_4_Collection.item_12;

import java.util.*;

/**
 * Created by Kovantonlenko on 11/16/2015.
 */
class Main {
    public static void main(String[] args) {
        /*
        Set<User> users = new HashSet<>();
        User user1 = new User(40, "Petia", "user1");
        User user2 = new User(40, "Petia", "user2");

        boolean add1 = users.add(user1);
        boolean add2 = users.add(user2);

        System.out.println(users);

        System.out.println(add1);
        System.out.println(add2);

//        В методах equals(Object o) и hashCode()
//        учитываются только поля age и firstName класса User
//        поэтому user1 и user2 считаются одинаковыми и
//        user2 не добавляется в HashSet.
       */

        /*
        Map<User, String> map = new HashMap<>();

        User user1 = new User(40, "Petia", "user1");
        User user2 = new User(40, "Petia", "user2");

        map.put(user1, "testUser1");
        map.put(user2, "testUser2");

        for (Map.Entry<User, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        */
        Map<User, String> map = new TreeMap<>(new MyUserComparator());

        User user1 = new User(40, "Petia", "user1");
        User user2 = new User(12, "Petia", "user2");
        User user3 = new User(45, "Petia", "user3");

        map.put(user1, "testUser1");
        map.put(user2, "testUser2");
        map.put(user3, "testUser3");

        for (Map.Entry<User, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

class MyUserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        //return o1.getAge().compareTo(o2.getAge());
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class User implements Comparable<User> {

    private Integer age;
    private String firstName;
    private String detector;

    public User(Integer age, String firstName, String detector) {
        this.age = age;
        this.firstName = firstName;
        this.detector = detector;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", detector='" + detector + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != null ? !age.equals(user.age) : user.age != null) return false;
        return !(firstName != null ? !firstName.equals(user.firstName) : user.firstName != null);

    }

    @Override
    public int hashCode() {
        int result = age != null ? age.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        return result;
    }


    public Integer getAge() {
        return this.age;
    }

    @Override
    public int compareTo(User o) {
        return -this.age.compareTo(o.age);
    }
}
