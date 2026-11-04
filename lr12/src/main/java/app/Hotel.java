package app;

import java.util.List;

public class Hotel {
    private int id;
    private String name;
    private String city;
    private int stars;
    private List<Integer> guestRatings;

    public Hotel(int id, String name, String city, int stars, List<Integer> guestRatings) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.stars = stars;
        this.guestRatings = guestRatings;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public List<Integer> getGuestRatings() {
        return guestRatings;
    }

    public double getAverageRating() {
        if (guestRatings == null || guestRatings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int rating : guestRatings) {
            sum += rating;
        }
        return (double) sum / guestRatings.size();
    }

    @Override
    public String toString() {
        return "Hotel{id=" + id
                + ", name='" + name + '\''
                + ", city='" + city + '\''
                + ", stars=" + stars
                + ", avgRating=" + getAverageRating()
                + '}';
    }
}
