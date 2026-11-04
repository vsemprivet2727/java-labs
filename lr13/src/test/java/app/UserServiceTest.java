package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserServiceTest {

    private UserService service;

    @BeforeEach
    void setUp() {
        service = new UserService();
    }

    @Test
    void registersAndLogsIn() {
        User registered = service.register("alice", "alice@example.com", "secret123", 25);

        User loggedIn = service.login("alice", "secret123");

        assertSame(registered, loggedIn);
        assertEquals(1, service.getUsers().size());
    }

    @Test
    void rejectsDuplicateUsername() {
        service.register("alice", "alice@example.com", "secret123", 25);

        assertThrows(InvalidUserDataException.class,
                () -> service.register("alice", "other@example.com", "secret456", 30));
    }

    @Test
    void rejectsInvalidDataOnRegistration() {
        assertThrows(InvalidUserDataException.class,
                () -> service.register("alice", "bad-email", "secret123", 25));
        assertThrows(InvalidUserDataException.class,
                () -> service.register("alice", "alice@example.com", "123", 25));
    }

    @Test
    void loginThrowsWhenUserNotFound() {
        assertThrows(UserNotFoundException.class, () -> service.login("ghost", "secret123"));
    }

    @Test
    void loginThrowsWhenPasswordIsWrong() {
        service.register("alice", "alice@example.com", "secret123", 25);

        assertThrows(AuthenticationException.class, () -> service.login("alice", "wrong"));
    }

    @Test
    void updatesEmailOfRegisteredUser() {
        service.register("alice", "alice@example.com", "secret123", 25);

        service.updateEmail("alice", "alice.new@example.org");

        assertEquals("alice.new@example.org", service.findUser("alice").getEmail());
    }

    @Test
    void updateEmailThrowsWhenUserNotFound() {
        assertThrows(UserNotFoundException.class,
                () -> service.updateEmail("ghost", "ghost@example.com"));
    }
}
