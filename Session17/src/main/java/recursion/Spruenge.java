package recursion;

public class Spruenge {

    public static void main(String[] args) {
        int d = 4; // Die Distanz
        int s1 = 1; // Erste Sprungweite
        int s2 = 2; // Zweite Sprungweite

        // Methode aufrufen und Ergebnis ausgeben
        int result = spruenge(d, s1, s2);
        System.out.println(result); // Erwartetes Ergebnis: 5
    }

    public static int spruenge(int d, int s1, int s2) {
        // Wenn die Distanz genau 0 ist, gibt es genau eine Möglichkeit
        if (d == 0) {
            return 1;
        }
        // Wenn die Distanz negativ ist, gibt es keine Möglichkeit
        if (d < 0) {
            return 0;
        }

        // Rekursive Aufrufe: Einmal mit Sprungweite s1 und einmal mit s2
        return spruenge(d - s1, s1, s2) + spruenge(d - s2, s1, s2);
    }
}
