import java.io.IOException;

public class CheckedVsUnchecked {

    public static void main(String[] args) {

        try {
            throw new IOException("I am a checked exception");
        } catch (IOException e) {
            e.printStackTrace();
        }

        throw new RuntimeException("I am an unchecked exception");

    }

}
