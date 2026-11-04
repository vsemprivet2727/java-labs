package app;

public class Ship extends Transport {
    private int tonnage;

    public Ship(int capacity, int speed, int fuel, int tonnage) {
        this.capacity = capacity;
        this.speed = speed;
        this.fuel = fuel;
        this.tonnage = tonnage;
    }

    @Override
    public void deliver() {
        System.out.println("Доставляет груз по воде");
    }

    @Override
    public void calculateTime() {
        System.out.println("Время: " + (fuel / (speed * 0.8)));
    }
}
