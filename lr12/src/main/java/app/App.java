package app;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Tool> tools = Map.of(
                "hammer1", new Hammer("hammer1", 1, 2.5, 0.35),
                "hammer2", new Hammer("hammer2", 2, 2.8, 0.40),
                "hammer3", new Hammer("hammer3", 3, 3.0, 0.45),
                "screwdriver1", new Screwdriver("screwdriver1", 4, 0.20, "flat"),
                "screwdriver2", new Screwdriver("screwdriver2", 5, 0.25, "phillips"),
                "screwdriver3", new Screwdriver("screwdriver3", 6, 0.22, "torx"),
                "wrench1", new Wrench("wrench1", 7, 1.2, 13),
                "wrench2", new Wrench("wrench2", 8, 1.5, 17));

        for (Map.Entry<String, Tool> entry : tools.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
