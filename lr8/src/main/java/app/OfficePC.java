package app;
class OfficePC extends Computer {
    double monitorSize;

    OfficePC(String processor, double ram, int storage, double monitorSize) {
        super(processor, ram, storage);
        this.monitorSize = monitorSize;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Monitor Size: " + monitorSize + " inches");
    }
    void printDocument() {
        System.out.println("Печатаю документ типа");
    }
}
