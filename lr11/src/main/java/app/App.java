package app;

public class App {
    public static void main( String[] args ) {
        Computer[] computers = new Computer[3];
        computers[0] = new Computer("Model1", 8, 512);
        computers[1] = new GamingPC("Model2", 16, 1024);
        computers[2] = new OfficePC("Model3", 4, 256);
        for (Computer computer : computers) {
            computer.run();
            computer.run("Program");
            computer.run(4);
            System.out.println(computer.getPerformance());
        }
    }
}
