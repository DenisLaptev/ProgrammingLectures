package com.kov.lectures.lecture_9_Servlet.beans;

/**
 * Created by Kovantonlenko on 12/20/2015.
 */
public class User {

    private int id;
    private int age;
    private String firstName;
    private String lastName;
    private String male;
    private String login;
    private String password;

    public User(String firstName, String lastName, String login, String password, String male) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.male = male;
    }

    public User() {
    }

    public User(int id, int age, String firstName) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
