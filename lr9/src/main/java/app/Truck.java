package app;

public class Truck extends Transport {
    private int cargoWeight;

    public Truck(int capacity, int speed, int fuel, int cargoWeight) {
        this.capacity = capacity;
        this.speed = speed;
        this.fuel = fuel;
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void deliver() {
        System.out.println("Доставляет груз по суше");
    }

    @Override
    public void calculateTime() {
        System.out.println("Время: " + (fuel / speed));
    }
}
