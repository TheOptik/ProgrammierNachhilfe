package http;

public class HttpAnfrage {

    private String httpVerb;
    private String url;
    private String[] headers = new String[20];

    public HttpAnfrage(String httpVerb, String url) {

        if (httpVerb.equals("GET") || httpVerb.equals("POST")) {
            this.httpVerb = httpVerb;
        } else {
            this.httpVerb = "GET";
        }

        this.url = url;
    }

    public void addHeader(String name, String wert) {
        for (int i = 0; i < headers.length; i++) {
            if (headers[i] == null) {
                headers[i] = name + ": " + wert;
                return;
            }
        }
    }

    @Override
    public String toString() {

        String ausgabe = "";

        ausgabe = httpVerb + " " + url + " HTTP/1.0" + "\r\n";

        for (int i = 0; i < headers.length; i++) {
            if (headers[i] != null) {
                ausgabe += headers[i] + "\r\n";
            }
        }

        ausgabe += "\r\n";

        return ausgabe;
    }

}
