package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void givenPasswordWithMoreThan8Characters_whenIsLengthValid_thenReturnsTrue() {
        // GIVEN
        String password = "Passwort123";

        // WHEN
        boolean result = Main.isLengthValid(password);

        // THEN
        assertTrue(result, "Das Passwort sollte mindestens 8 Zeichen lang sein.");
    }
    @Test
    void givenPasswordWithExactly8Characters_whenIsLengthValid_thenReturnsTrue() {
        // GIVEN
        String password = "abcdefgh";

        // WHEN
        boolean result = Main.isLengthValid(password);

        // THEN
        assertTrue(result, "Das Passwort sollte mindestens 8 Zeichen lang sein.");
    }
    @Test
    void givenPasswordWithLessThan8Characters_whenIsLengthValid_thenReturnsTrue() {
        // GIVEN
        String password = "Pass";

        // WHEN
        boolean result = Main.isLengthValid(password);

        // THEN
        assertFalse(result, "Das Passwort sollte weniger 8 Zeichen lang sein.");
    }

    @Test
    void givenPasswordWithDigits_whenContainsDigit_thenReturnsTrue() {
        // GIVEN
        String password = "Passwort123";

        // WHEN
        boolean result = Main.containsDigit(password);

        // THEN
        assertTrue(result, "Das Passwort enthält ziffern");

    }
    @Test
    void givenPasswordWithoutDigits_whenContainsDigit_thenReturnsTrue() {
        // GIVEN
        String password = "Passwort";

        // WHEN
        boolean result = Main.containsDigit(password);

        // THEN
        assertFalse(result, "Das Passwort sollte ziffern enthalten");
    }

}