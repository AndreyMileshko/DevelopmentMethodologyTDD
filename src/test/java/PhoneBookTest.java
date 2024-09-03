import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PhoneBookTest {
    private PhoneBook phoneBook;

    @BeforeEach
    void preparatoryProcedures() {
        phoneBook = new PhoneBook();
    }

    @Test
    void afterAddingAnItemTheAddMethodWillReturn1() {
        int size = phoneBook.add("TestName", 88005009120L);
        assertEquals(1, size);
    }

    @Test
    void checkThatTheAddMethodAddsValidElement() {
        phoneBook.add("TestName", 88005009120L);
        assertTrue(phoneBook.phoneBookMap.containsKey("TestName"));
    }
}
