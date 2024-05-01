public class Main {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle("Igor", 1);
        Bicycle bicycle2 = new Bicycle("Stels", 2);
        Service car1 = new Car("Dudu", 4);
        Car car2 = new Car("Giguli", 3);
        Transport truck1 = new Truck("Kamaz", 8);
        Truck truck2 = new Truck("Volvo", 16);
        bicycle1.setModelName("Velik");
        car2.setWheelsCount(4);
        CheckService checkService = new CheckService();
        checkService.check(bicycle1);
        System.out.println();
        checkService.check(car1);
        System.out.println();
        checkService.check(truck1);

    }
}