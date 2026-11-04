package app;

public class Textbook implements Readable, Lendable {
    private String title;
    private String author;
    private int pages;
    private String subject;
    private boolean available;

    public Textbook(String title, String author, int pages, String subject) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.subject = subject;
        this.available = true;
    }

    @Override
    public void read() {
        System.out.println("Читаю " + title);
    }

    @Override
    public int getPages() {
        return pages;
    }

    @Override
    public void lend() {
        if (!available) {
            System.out.println("Книга недоступна");
            return;
        }

        System.out.println("Отдалживаю " + title);
        available = false;
    }

    @Override
    public void returnBook() {
        if (available) {
            System.out.println("Книга уже доступна");
            return;
        }
        System.out.println("Возвращаю " + title);
        available = true;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}
