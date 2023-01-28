package http;

public class Main {

    public static void main(String[] args) {

        HttpAnfrage anfrage = new HttpAnfrage("GET", "http://www.google.de/index.html");
        anfrage.addHeader("Content-Type", "text/html");

        System.out.println("___");
        System.out.println(anfrage.toString());
        System.out.println("___");

    }

}
