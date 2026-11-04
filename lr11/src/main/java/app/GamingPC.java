package app;

public class GamingPC extends Computer {
    public GamingPC(String model, int ram, int storage) {
        super(model, ram, storage);
    }

    @Override
    public String getPerformance() {
        return "Высокая";
    }
}
