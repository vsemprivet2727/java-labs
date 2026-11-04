package app;

public class Wrench extends Tool {
    private final double size;

    public Wrench(String name, int id, double weight, double size) {
        super(name, id, weight);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Wrench{" + super.toString() + ", size=" + size + "}";
    }
}
