package models;

public class User {
    private String name;
    private String surName;
    private SmartPhone smartPhone;

    public User(String name, String surName, SmartPhone smartPhone) {
        this.name = name;
        this.surName = surName;
        this.smartPhone = smartPhone;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public SmartPhone getSmartPhone() {
        return smartPhone;
    }

    public void setName() {
        this.name = name;
    }

    public void setSurName() {
        this.surName = surName;
    }

    public void setSmartPhone() {
        this.smartPhone = smartPhone;
    }
}
