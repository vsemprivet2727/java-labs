package app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HotelDemo {
    public static void main(String[] args) {
        List<Hotel> hotels = new ArrayList<>(List.of(
                new Hotel(1, "Aurora", "Moscow", 4, List.of(5, 4, 4)),
                new Hotel(2, "Bristol", "Kazan", 3, List.of(2, 2, 2)),
                new Hotel(3, "Cosmos", "Sochi", 4, List.of(5, 4, 4)),
                new Hotel(4, "Diamond", "Moscow", 5, List.of(3, 3, 3)),
                new Hotel(5, "Elegant", "Omsk", 2, List.of(1, 2)),
                new Hotel(6, "Falcon", "Kazan", 3, List.of(4, 4, 4))));

        for (Hotel hotel : hotels) {
            if (hotel.getAverageRating() < 3) {
                System.out.println(hotel);
            }
        }

        for (Hotel hotel : hotels) {
            if (hotel.getAverageRating() >= 4) {
                hotel.setStars(hotel.getStars() + 1);
            }
        }

        printHotels(hotels, 5);

        List<Hotel> sorted = new ArrayList<>(hotels);
        sorted.sort(Comparator.comparingDouble(Hotel::getAverageRating)
                .thenComparing(Hotel::getName)
                .reversed());

        for (Hotel hotel : sorted) {
            System.out.printf("%d %s %.2f%n",
                    hotel.getId(), hotel.getName(), hotel.getAverageRating());
        }
    }

    static void printHotels(List<Hotel> hotels, int stars) {
        for (Hotel hotel : hotels) {
            if (hotel.getStars() == stars) {
                System.out.println(hotel);
            }
        }
    }
}
