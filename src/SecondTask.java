import models.SmartPhone;
import models.User;

public class SecondTask {
    public static void installApp(User user) {
        if (!сheckingTheYearOfManufacture(user.getSmartPhone())) {
            System.out.println(user + ", установите облегченную версию приложения для " + user.getSmartPhone().getOperationSystem());
        } else {
            System.out.println(user + ", установите версию приложения для " + user.getSmartPhone().getOperationSystem());
        } }
    public static boolean сheckingTheYearOfManufacture(SmartPhone smartPhone) {
        return smartPhone.getYear() >= 2015;
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone4", 2011, 1);
        User iOSUser = new User("Ваня", "Гончаров", smartPhone);
        installApp(iOSUser);
    }
}
