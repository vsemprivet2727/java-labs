class Smartphone {
    private String brand;
    private double price;
    private int batteryLife;

    String getBrand() {
        return brand;
    }
    double getPrice() {
        return price;
    }
    int getBatteryLife() {
        return batteryLife;
    }
    Smartphone(String brand, double price, int batteryLife) {
        this.brand = brand;
        this.price = price;
        this.batteryLife = batteryLife;
    }
}
