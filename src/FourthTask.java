import models.Delivery;

public class FourthTask {
    public static void deliveryMessage (int days) {
        System.out.println("Постребуется дней: " + days);
    }
    public static void checkingDistance(Delivery delivery) {
        int distance = delivery.deliveryDistance;
        if (distance <= 0) {
            System.out.println("Дистанция не может быть меньше, либо равна нулю");
            return;
        }
        if (distance < 20) {
            deliveryMessage(1);
        } else if (distance < 60) {
            deliveryMessage(2);
        } else if (distance < 100) {
            deliveryMessage(3);
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void main(String[] args) {
        Delivery delivery = new Delivery(95);
        checkingDistance(delivery);

    }
}
