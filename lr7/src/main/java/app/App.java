package app;

public class App {
    public static void main( String[] args ) {
        Game[] games = {
            new Game("The Witcher 3", "RPG", 10),
            new Game("CS:GO", "Шутер", 8),
            new Game("Minecraft", "Песочница", 9),
            new Game("Tetris", "Головоломка", 7),
            new Game("Among Us", "Кооператив", 6),
            new Game("FIFA 24", "Футбольчик", 5)
        };

        System.out.printf("Средний рейтинг: %.2f%n", Game.getAverageRating());
    }
}
