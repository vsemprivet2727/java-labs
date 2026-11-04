package app;

public abstract class Transport {
    protected int capacity;
    protected int speed;
    protected int fuel;

    public abstract void deliver();
    public abstract void calculateTime();
    public void displayInfo() {
        System.out.println("Capacity: " + capacity + ", Speed: " + speed + ", Fuel: " + fuel);
    }
}
