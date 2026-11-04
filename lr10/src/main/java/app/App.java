package app;

// Интерфейсы:
// 1. “Readable” — методы: “read()”, “getPages()”
// 2. “Lendable” — методы: “lend()”, “returnBook()”, “isAvailable()”
// Классы:
// 1. “Novel” — поля: “title”, “author”, “pages”, “available”
// 2. “Textbook” — поля: “title”, “author”, “pages”, “subject”
// Задание: Создайте 3 романа и 2 учебника, прочитайте и выдайте книги.
public class App {
    public static void main(String[] args) {
        Novel[] novels = {
            new Novel("Война и мир", "Лев Толстой", 1225),
            new Novel("Преступление и наказание", "Фёдор Достоевский", 671),
            new Novel("Мастер и Маргарита", "Михаил Булгаков", 480)
        };

        Textbook[] textbooks = {
            new Textbook("Алгебра", "А. Г. Мордкович", 400, "Математика"),
            new Textbook("Общая биология", "А. А. Каменский", 512, "Биология")
        };

        for (Novel novel : novels) {
            novel.read();
            novel.lend();
        }

        for (Textbook textbook : textbooks) {
            textbook.read();
            textbook.lend();
        }
    }
}
