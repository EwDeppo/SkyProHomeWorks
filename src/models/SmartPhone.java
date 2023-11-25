package models;

public class SmartPhone {
    public String name;
    public int year;

    public OperationSystem operationSystem;

    public SmartPhone(String name, int year, int numberOperationSystem) {
        this.name = name;
        this.year = year;
        this.operationSystem = new OperationSystem(numberOperationSystem);
    }
}
