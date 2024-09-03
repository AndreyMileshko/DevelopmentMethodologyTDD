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
        assertEquals(1, phoneBook.add("TestName", 88005009120L));
    }

    @Test
    void checkThatTheAddMethodAddsValidElement() {
        phoneBook.add("TestName", 88005009120L);
        assertTrue(phoneBook.phoneBookMap.containsKey("TestName"));
    }

    @Test
    void elementNameSearch() {
        phoneBook.add("TestName", 88005009120L);
        assertEquals("TestName", phoneBook.findByNumber(88005009120L));
    }


}
