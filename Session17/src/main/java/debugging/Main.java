package debugging;

public class Main {

    public static void main(String[] args) {


        int sum = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println(Math.random() < 0.1 ? parseNumber(null) : parseNumber("" + i));
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(recursion(i));
        }

    }


    public static int parseNumber(String numberAsString) {
        return Integer.parseInt(numberAsString);
    }

    public static int recursion(int i) {
        if (i <= 0) {
            return 1;
        }
        return recursion(i - 1) + i;
    }


    public static int meineColleFunktion(int i) {

        return i * i;

    }


}