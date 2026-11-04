package app;
class Game {
    String name;
    String genre;
    int rating;

    static int totalGames = 0;
    static int totalRatings = 0;

    Game(String name, String genre, int rating) {
        totalGames++;
        totalRatings += rating;
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    static double getAverageRating() {;
        return (double) totalRatings / totalGames;
    }

    static void print(Game game) {
        System.out.println(game.name + ", " + game.genre + ", " + game.rating);
        System.out.println(totalGames + ", " + totalRatings);
    }
}
