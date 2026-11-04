package app;

public class Hammer extends Tool {
    private final double handleLength;

    public Hammer(String name, int id, double weight, double handleLength) {
        super(name, id, weight);
        this.handleLength = handleLength;
    }

    public double getHandleLength() {
        return handleLength;
    }

    @Override
    public String toString() {
        return "Hammer{" + super.toString() + ", handleLength=" + handleLength + "}";
    }
}
