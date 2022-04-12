import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTests {

    @Test
    public void getPhoneNumberTest() {
        // arrange
        Contact sut = new Contact("Jim", "+7 (989) 555-66-77");
        String expected = "+7 (989) 555-66-77";
        // act
        String result = sut.getPhoneNumber();
        // assert
        assertEquals(expected, result);
    }

    @Test
    public void equalsFalseTest() {
        // arrange
        Contact sut1 = new Contact("Jim", "+7 (989) 555-66-77");
        Contact sut2 = new Contact("Dwight", "+7 (898) 123-45-67");
        // act
        // assert
        assertFalse(sut1.equals(sut2));
    }

    @Test
    public void equalsTrueTest() {
        // arrange
        Contact sut1 = new Contact("Dwight", "+7 (898) 123-45-67");
        Contact sut2 = new Contact("Dwight", "+7 (898) 123-45-67");
        // act
        // assert
        assertTrue(sut1.equals(sut2));
    }
}
