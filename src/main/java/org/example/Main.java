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
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i); // Hol dir das Zeichen an der Position i // Prüfe, ob das Zeichen eine Ziffer ist
            if (Character.isDigit(ch)) {
                return true;  // Wenn eine Ziffer gefunden wurde, gib true zurück
            }
        }
        return false;
    }

    public static boolean containsUpperAndLowerCase(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;  // Prüft auf Großbuchstaben
            if (Character.isLowerCase(ch)) hasLower = true;  // Prüft auf Kleinbuchstaben

            if (hasUpper && hasLower) return true; // Falls beide gefunden wurden, sofort beenden
        }

        return false; // Falls nicht beides gefunden wurde, Rückgabe ist false
    }

    public static boolean isCommonPassword(String password) {
        String[] commonPasswords = {"123456", "password", "Passwort1", "passWORT", "Abcd12345"};
        for (String common : commonPasswords) {
            if (common.equals(password)) {
                return true;
            }
        }
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

/*password.toCharArray(): Dies ist eine Methode der Klasse String, die einen String in
ein Char-Array umwandelt. Ein String besteht aus Zeichen, und mit toCharArray()
kannst du alle Zeichen des Strings in einem Array vom Typ char speichern. Jedes Element
dieses Arrays ist ein einzelnes Zeichen des Strings.
 */

/*password.toCharArray()	Wandelt den String in ein char[]-Array um
for (char ch : password.toCharArray())	Läuft durch jedes Zeichen des Passworts
ch	Repräsentiert das aktuelle Zeichen in der Schleife
Character.isDigit(ch)	Prüft, ob ch eine Ziffer ist
Character.isUpperCase(ch)	Prüft, ob ch ein Großbuchstabe ist
Character.isLowerCase(ch)	Prüft, ob ch ein Kleinbuchstabe ist
 */

/*equals() wird verwendet, um den Inhalt von Strings zu vergleichen.
== prüft nur, ob zwei Variablen auf dasselbe Objekt im Speicher verweisen. */

