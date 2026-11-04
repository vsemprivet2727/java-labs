package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class UserTest {

    @Test
    void createsValidUser() {
        User user = new User("alice", "alice@example.com", "secret123", 25);

        assertEquals("alice", user.getUsername());
        assertEquals("alice@example.com", user.getEmail());
        assertEquals(25, user.getAge());
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "plainaddress",
            "missing@domain",
            "@example.com",
            "user@.com",
            "user@example.",
            "user@@example.com",
            "user@exam ple.com"
    })
    void rejectsInvalidEmail(String email) {
        assertThrows(InvalidUserDataException.class,
                () -> new User("alice", email, "secret123", 25));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void rejectsNullOrEmptyEmail(String email) {
        assertThrows(InvalidUserDataException.class,
                () -> new User("alice", email, "secret123", 25));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "12345"})
    void rejectsShortPassword(String password) {
        assertThrows(InvalidUserDataException.class,
                () -> new User("alice", "alice@example.com", password, 25));
    }

    @Test
    void acceptsPasswordOfMinimumLength() {
        User user = new User("alice", "alice@example.com", "123456", 25);

        assertTrue(user.authenticate("123456"));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"   "})
    void rejectsBlankUsername(String username) {
        assertThrows(InvalidUserDataException.class,
                () -> new User(username, "alice@example.com", "secret123", 25));
    }

    @Test
    void rejectsNegativeAge() {
        assertThrows(InvalidUserDataException.class,
                () -> new User("alice", "alice@example.com", "secret123", -1));
    }

    @Test
    void authenticatesWithCorrectPassword() {
        User user = new User("alice", "alice@example.com", "secret123", 25);

        assertTrue(user.authenticate("secret123"));
    }

    @Test
    void rejectsWrongPassword() {
        User user = new User("alice", "alice@example.com", "secret123", 25);

        assertThrows(AuthenticationException.class, () -> user.authenticate("wrong"));
        assertThrows(AuthenticationException.class, () -> user.authenticate(null));
    }

    @Test
    void updatesEmail() {
        User user = new User("alice", "alice@example.com", "secret123", 25);

        user.updateEmail("new@example.org");

        assertEquals("new@example.org", user.getEmail());
    }

    @Test
    void keepsOldEmailWhenUpdateFails() {
        User user = new User("alice", "alice@example.com", "secret123", 25);

        assertThrows(InvalidUserDataException.class, () -> user.updateEmail("broken"));

        assertEquals("alice@example.com", user.getEmail());
    }
}
