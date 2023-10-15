package entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class CommonUserTest {

    private CommonUser user;

    @BeforeEach
    void init() {
        user = new CommonUser("Paul", "password", LocalDateTime.now());
    }

    @Test
    void getNameTest() {
        assertEquals("Paul", user.getName());
    }

    @Test
    void getPasswordTest() {
        assertEquals("password", user.getPassword());
    }

}