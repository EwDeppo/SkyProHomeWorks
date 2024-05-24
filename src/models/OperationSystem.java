package models;

public class OperationSystem {
    public static String ios = "iOS";
    public static String android = "Android";
    public String operationSystem;
    public OperationSystem(int numberOfOperationSystem) {
        if (numberOfOperationSystem < 0 || numberOfOperationSystem > 1) {
            System.out.println("Такой операционной системы не существует");
        } else if (numberOfOperationSystem == 0) {
            this.operationSystem = ios;
        } else {
            this.operationSystem = android;
        }
    }
    public String toString() {
        return operationSystem;
    }
}

