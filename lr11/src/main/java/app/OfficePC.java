package app;

public class OfficePC extends Computer {
    public OfficePC(String model, int ram, int storage) {
        super(model, ram, storage);
    }

    @Override
    public String getPerformance() {
        return "Средняя";
    }
}
