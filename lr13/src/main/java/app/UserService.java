package app;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UserService {

    private final Map<String, User> users = new LinkedHashMap<>();

    public User register(String username, String email, String password, int age) {
        if (users.containsKey(username)) {
            throw new InvalidUserDataException("Пользователь " + username + " уже существует");
        }
        User user = new User(username, email, password, age);
        users.put(username, user);
        return user;
    }

    public User login(String username, String password) {
        User user = findUser(username);
        user.authenticate(password);
        return user;
    }

    public User findUser(String username) {
        User user = users.get(username);
        if (user == null) {
            throw new UserNotFoundException("Пользователь " + username + " не найден");
        }
        return user;
    }

    public void updateEmail(String username, String newEmail) {
        findUser(username).updateEmail(newEmail);
    }

    public Collection<User> getUsers() {
        return Collections.unmodifiableCollection(users.values());
    }
}
