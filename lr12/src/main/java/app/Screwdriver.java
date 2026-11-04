package app;

public class Screwdriver extends Tool {
    private final String tipType;

    public Screwdriver(String name, int id, double weight, String tipType) {
        super(name, id, weight);
        this.tipType = tipType;
    }

    public String getTipType() {
        return tipType;
    }

    @Override
    public String toString() {
        return "Screwdriver{" + super.toString() + ", tipType=" + tipType + "}";
    }
}
