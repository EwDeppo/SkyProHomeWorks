public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Меняем двигатель");
    }

    @Override
    public void service() {
        super.service();
        updateTyre();
        checkEngine();
    }
}
