package app;

public class App {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        computers[0] = new GamingPC("Intel Core i9", 32, 1024, "RTX 4080");
        computers[1] = new GamingPC("AMD Ryzen 7", 16, 512, "RTX 3070");
        computers[2] = new GamingPC("Intel Core i7", 16, 512, "RTX 4060");

        computers[3] = new OfficePC("Intel Core i5", 8, 256, 24.0);
        computers[4] = new OfficePC("AMD Ryzen 5", 8, 512, 27.0);

        for (Computer c : computers) {
            c.displayInfo();
            System.out.println(c.getProcessor() + ", " + c.getRam() + " GB, " + c.getStorage() + " GB");
            c.getPerfomance();

            if (c instanceof GamingPC)
                ((GamingPC) c).playGame();
            if (c instanceof OfficePC)
                ((OfficePC) c).printDocument();
        }
    }
}
