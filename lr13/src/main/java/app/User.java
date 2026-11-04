package app;

public class User {

    private final String username;
    private String email;
    private final String password;
    private final int age;

    public User(String username, String email, String password, int age) {
        if (username == null || username.isBlank()) {
            throw new InvalidUserDataException("Имя пользователя не может быть пустым");
        }
        if (email == null || !email.matches("[^@\\s]+@[^@\\s]+\\.[^@\\s]+")) {
            throw new InvalidUserDataException("Некорректный email: " + email);
        }
        if (password == null || password.length() < 6) {
            throw new InvalidUserDataException("Пароль должен содержать не менее 6 символов");
        }
        if (age < 0) {
            throw new InvalidUserDataException("Возраст не может быть отрицательным");
        }

        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public boolean authenticate(String candidatePassword) {
        if (!password.equals(candidatePassword)) {
            throw new AuthenticationException("Неверный пароль для пользователя " + username);
        }
        return true;
    }

    public void updateEmail(String newEmail) {
        if (newEmail == null || !newEmail.matches("[^@\\s]+@[^@\\s]+\\.[^@\\s]+")) {
            throw new InvalidUserDataException("Некорректный email: " + newEmail);
        }
        this.email = newEmail;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', email='" + email + "', age=" + age + "}";
    }
}
