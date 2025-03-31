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

    @Test
    void givenPasswordWithUpperAndLowerCase_whenContainsUpperAndLowerCase_thenReturnsTrue() {
        // GIVEN
        String password = "Passwort123";

        // WHEN
        boolean result = Main.containsUpperAndLowerCase(password);

        // THEN
        assertTrue(result);
    }
    @Test
    void givenPasswordWithOnlyUpperCase_whenContainsUpperAndLowerCase_thenReturnsTrue() {
        // GIVEN
        String password = "PASSWORT123";

        // WHEN
        boolean result = Main.containsUpperAndLowerCase(password);

        // THEN
        assertFalse(result);
    }

    @Test
    void givenPasswordWithOnlyUpperCase_whenContainsUpperAndLowerCase_thenReturnsFalse() {
        // GIVEN
        String password = "passwort123";

        // WHEN
        boolean result = Main.containsUpperAndLowerCase(password);

        // THEN
        assertFalse(result);
    }

    @Test
    void givenPasswordWithNoLetters_whenContainsUpperAndLowerCase_thenReturnsFalse() {
        // GIVEN
        String password = "12345678";

        // WHEN
        boolean result = Main.containsUpperAndLowerCase(password);

        // THEN
        assertFalse(result);
    }

    @Test
    void givenCommonPassword_whenChecked_thenReturnsTrue() {
        // GIVEN: Ein schwaches Passwort aus der Liste
        String password = "Passwort1";

        // WHEN: Die Methode wird aufgerufen
        boolean result = Main.isCommonPassword(password);

        // THEN: Das Passwort sollte als häufig verwendet erkannt werden
        assertTrue(result);
    }

    @Test
    void givenUncommonPassword_whenChecked_thenReturnsFalse() {
        // GIVEN: Ein sicheres, nicht häufig verwendetes Passwort
        String password = "MeinSicheresPasswort2024!";

        // WHEN: Die Methode wird aufgerufen
        boolean result = Main.isCommonPassword(password);

        // THEN: Das Passwort sollte NICHT als häufig erkannt werden
        assertFalse(result);
    }




}