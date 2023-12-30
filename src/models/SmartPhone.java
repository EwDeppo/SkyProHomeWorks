package models;

public class SmartPhone {
    private String name;
    private int year;
    private String operationSystem;

    public SmartPhone(String name, int year, int numberOS) {
        this.name = name;
        this.year = year;
        setOperationSystem(numberOS);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getOperationSystem(){
        return operationSystem;
    }
    public void setOperationSystem(int numberOS) {
        if (numberOS < 0 || numberOS > 1) {
            System.out.println("Такой операционной системы не существует");
        } else if (numberOS == 0) {
            System.out.println("Android");
        } else {
            System.out.println("iOS");
        }
    }

    public void setName() {
        this.name = name;
    }

    public void setYear() {
        this.year = year;
    }

    public void setOperationSystem() {
        this.operationSystem = operationSystem;
    }
}
