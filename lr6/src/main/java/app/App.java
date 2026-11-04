package app;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        Book[] books = {
            new Book("Voyna i mir", "Lev Tolstoy", 1200),
            new Book("Hello World", "Me", 2026),
            new Book("Bye world", "Not me", 1000),
        };

        Arrays.stream(books)
            .filter(b -> b.isOld())
            .forEach(b -> System.out.println(b.getTitle()));
    }
}
