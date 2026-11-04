package app;
class Computer {
    private String processor;
    private double ram;
    private int storage;

    Computer(String processor, double ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    Computer() {}

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    void displayInfo() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
    }

    void getPerfomance() {
        System.out.println("Производительности нема");
    }
}
