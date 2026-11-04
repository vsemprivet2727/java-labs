package app;

public class Tool {
    private final String name;
    private final int id;
    private final double weight;

    public Tool(String name, int id, double weight) {
        this.name = name;
        this.id = id;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " (id=" + id + ", weight=" + weight + ")";
    }
}
