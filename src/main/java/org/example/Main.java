package org.example;

public class Main {
    public static void main(String[] args) {
        //hier Methoden testen
        String password = "Passwort123";

        // Teste die Methoden
        System.out.println("Passwortlänge gültig: " + isLengthValid(password));        // Erwartet: true
        System.out.println("Enthält Ziffern: " + containsDigit(password));            // Erwartet: true
        System.out.println("Enthält Groß- und Kleinbuchstaben: " + containsUpperAndLowerCase(password)); // Erwartet: true
        System.out.println("Häufiges Passwort: " + isCommonPassword(password));       // Erwartet: false
    }


    public static boolean isLengthValid(String password) {
        return password.length() >= 8;
    }
    public static boolean containsDigit(String password) {
        return false;
    }

    public static boolean containsUpperAndLowerCase(String password) {
        return false;
    }
    public static boolean isCommonPassword(String password) {
        return false;
    }

}


    /*for-Schleife: Ideal, wenn du Zeichen eines Strings durchgehen willst
    (z. B. um zu prüfen, ob eine Ziffer enthalten ist).
    if-else: Um Bedingungen zu prüfen und den boolean-Wert entsprechend zurückzugeben.
    Array (String[]: Praktisch,
    wenn du eine Liste mit häufig verwendeten Passwörtern speichern willst.
     */
    /*Aufgabe 1
    Recherche: Signaturen definieren
    Rückgabewerte: Boolean ( weil wir wissen wollen ob die Bedinung erfüllt wurde oder nicht)
    Parametertypen: String ( weil wir eine Zeichenkette prüfen)
    Methodennamen:
    Passwort ist mindestens 8 Zeichen lang	isLengthValid(String password)
    Passwort enthält mindestens eine Zahl	containsDigit(String password)
    Passwort hat Groß- und Kleinbuchstaben	hasUpperAndLowerCase(String password)
    Passwort ist in einer Liste häufiger Passwörter	isCommonPassword(String password)
     */
// Prüft, ob das Passwort mindestens 8 Zeichen lang ist
// public static boolean isLengthValid(String password);

// Prüft, ob das Passwort mindestens eine Ziffer enthält
// public static boolean containsDigit(String password);

// Prüft, ob das Passwort sowohl Groß- als auch Kleinbuchstaben enthält
// public static boolean containsUpperAndLowerCase(String password);

// Prüft, ob das Passwort in einer Liste häufig verwendeter Passwörter vorkommt
// public static boolean isCommonPassword(String password);
