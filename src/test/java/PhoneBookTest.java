import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PhoneBookTest {
    private PhoneBook phoneBook;

    @BeforeEach
    void preparatoryProcedures() {
        phoneBook = new PhoneBook();
        phoneBook.add("TestName", 88005009120L);
    }

    @Test
    void afterAddingAnItemTheAddMethodWillReturn1() {
        assertEquals(1, phoneBook.add("TestName", 88005009120L));
    }

    @Test
    void checkThatTheAddMethodAddsValidElement() {
        assertTrue(phoneBook.phoneBookMap.containsKey("TestName"));
    }

    @Test
    void elementSearchByName() {
        assertEquals("TestName", phoneBook.findByNumber(88005009120L));
    }

    @Test
    void elementSearchByNumber() {
        assertEquals(88005009120L, phoneBook.findByName("TestName"));
    }
}
