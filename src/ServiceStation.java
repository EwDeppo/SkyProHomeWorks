public class ServiceStation extends Transport implements Service {
    public ServiceStation(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service(Bicycle bicycle) {
        updateTyre();
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }

    public void service(Car car) {
        updateTyre();
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
                car.checkEngine();
            }
        }
    }

    public void service(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
                truck.checkEngine();
                truck.checkTrailer();
            }
        }
    }

    @Override
    public void service() {
    }
}