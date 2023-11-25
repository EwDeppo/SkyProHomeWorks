package models;

public class User {

    public String name;

    public String surName;

    public SmartPhone smartPhone;
// ниже под этой строчкой конструктор, а выше переменные
    public User(String name, String surName, SmartPhone smartPhone) {
        this.name = name;
        this.surName = surName;
        this.smartPhone = smartPhone;

    }
    public String toString() {
        return name + " " + surName;
    }
}
