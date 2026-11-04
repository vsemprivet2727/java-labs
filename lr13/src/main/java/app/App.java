package app;

public class App {

    public static void main(String[] args) {
        UserService service = new UserService();

        User alice = service.register("alice", "alice@example.com", "secret123", 25);
        service.register("bob", "bob@example.com", "qwerty", 31);
        System.out.println("Зарегистрирован: " + alice);

        User loggedIn = service.login("alice", "secret123");
        System.out.println("Вход выполнен: " + loggedIn.getUsername());

        try {
            service.login("alice", "wrong");
        } catch (AuthenticationException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            service.login("charlie", "secret123");
        } catch (UserNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            service.register("dave", "not-an-email", "secret123", 20);
        } catch (InvalidUserDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        alice.updateEmail("alice.new@example.org");
        System.out.println("Новый email: " + alice.getEmail());
    }
}
