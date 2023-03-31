import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IoStreamZeug {

    public static void main(String[] args) throws Exception {

        try (OutputStreamWriter myOutputStreamWriter = new OutputStreamWriter(new FileOutputStream("output.txt"))) {
            myOutputStreamWriter.write("ab");
            throw new Exception("oh no!");
        } // myOutputStreamWriter.close()
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader myInputStreamReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream(
          "input.txt"))))) {

            System.out.println("Programm gestartet in: " + System.getProperty("user.dir"));
            System.out.println(myInputStreamReader.readLine());

        }

    }

}
