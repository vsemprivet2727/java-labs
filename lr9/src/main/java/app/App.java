package app;

public class App {
    public static void main( String[] args ) {
        Truck[] trucks = new Truck[3];
        trucks[0] = new Truck(1000, 60, 600, 800);
        trucks[1] = new Truck(1500, 80, 800, 1200);
        trucks[2] = new Truck(2000, 90, 900, 1500);

        Ship[] ships = new Ship[2];
        ships[0] = new Ship(5000, 40, 800, 3000);
        ships[1] = new Ship(8000, 50, 1000, 6000);

        System.out.println("Грузовики:");
        for (int i = 0; i < trucks.length; i++) {
            System.out.println("Грузовик " + (i + 1));
            trucks[i].displayInfo();
            trucks[i].deliver();
            System.out.print("Время доставки: ");
            trucks[i].calculateTime();
        }

        System.out.println("Корабли:");
        for (int i = 0; i < ships.length; i++) {
            System.out.println("Корабль " + (i + 1));
            ships[i].displayInfo();
            ships[i].deliver();
            System.out.print("Время доставки: ");
            ships[i].calculateTime();
        }
    }
}
