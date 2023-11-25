import models.SmartPhone;
import models.User;

import static models.OperationSystem.ios;

public class TaskFirst {
    public static void installApp(User user) {
        if (!сheckingTheYearOfManufacture(user.smartPhone)) {
            System.out.println(user + ", установите облегченную версию приложения для " + user.smartPhone.operationSystem);
        } else {
        System.out.println(user + ", установите версию приложения для " + user.smartPhone.operationSystem);
    } }
    public static boolean сheckingTheYearOfManufacture(SmartPhone smartPhone) {
        return smartPhone.year >= 2015;
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone4", 2011, 1);
        User iOSUser = new User("Ваня", "Гончаров", smartPhone);
        installApp(iOSUser);
    }
}
