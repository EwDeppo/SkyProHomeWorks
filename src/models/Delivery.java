package models;

public class Delivery {
    private int deliveryDistance;
    private String deliveryMessage;

    public Delivery(int deliveryDistance, String deliveryMessage) {
        this.deliveryDistance = deliveryDistance;
        this.deliveryMessage = deliveryMessage;
    }

    public String getDeliveryMessage() {
        return deliveryMessage;
    }

    public int getDeliveryDistance() {
        if (distance <= 0) {
            System.out.println("Дистанция не может быть меньше, либо равна нулю");
            return distance;
        }
        if (distance < 20) {
            getDeliveryMessage(1);
        } else if (distance < 60) {
            getDeliveryMessage(2);
        } else if (distance < 100) {
            getDeliveryMessage(3);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public void setDeliveryDistance() {
        this.deliveryDistance = deliveryDistance;
    }
}
