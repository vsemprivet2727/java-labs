package app;

import java.time.LocalDate;

class Book {
    private String title;
    private String author;
    private int year;

    private int quantity;
    Book(String title, String author, int year, int quantity) {
        this(title, author, year);
        this.quantity = quantity;
    }
    Book (String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    String getTitle() {
        return this.title;
    }
    String getAuthor() {
        return this.author;
    }
    int getYear() {
        return this.year;
    }
    int getQuantity() {
        return quantity;
    }
    void setQuaintity(int quantity) {
        this.quantity = quantity;
    }
    void setTitle(String title) {
        this.title = title;
    }
    void setAuthor(String author) {
        this.author = author;
    }
    void setYear(int year) {
        this.year = year;
    }

    boolean isOld() {
        return (LocalDate.now().getYear() - this.year) > 50;
    }
}
