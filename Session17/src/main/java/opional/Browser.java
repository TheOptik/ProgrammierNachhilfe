package opional;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class Browser {

    public Optional<URL> back() {
        try {
            //simulate: fetch last URL from Stack
            return Math.random() < 0.5 ? Optional.of(new URL("http://google.de")) : Optional.empty();
        } catch (MalformedURLException e) {
            return Optional.empty();
        }
    }


    public static void main(String[] args) {
        var browser = new Browser();

        Optional<URL> url = browser.back();

        if (url.isPresent()) {
            System.out.println(url.get());
        }

        url.ifPresent(System.out::println);
    }


}
