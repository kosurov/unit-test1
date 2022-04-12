import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTests {
    @Test
    public void getContactByNumberTest() {
        // arrange
        PhoneBook phoneBook = new PhoneBook();
        Contact user = new Contact("Dwight", "+7 (898) 123-45-67");

        // act
        phoneBook.addContact("Dwight", user);
        Contact result = phoneBook.getContactByNumber("+7 (898) 123-45-67");

        // assert
        assertEquals(user, result);
    }
}
