package app;

public class Novel implements Readable, Lendable {
    private String title;
    private String author;
    private int pages;
    private boolean available;

    public Novel(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
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
        if (!isAvailable()) {
            System.out.println("Книга недочтупна");
            return;
        }

        System.out.println("Отдалживаю " + title);
        available = false;
    }

    @Override
    public void returnBook() {
        if (isAvailable()) {
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
