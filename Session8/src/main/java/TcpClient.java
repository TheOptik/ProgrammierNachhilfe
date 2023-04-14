import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TcpClient {

    public static void main(String[] args) {

        try (Socket connectionToServer = new Socket("localhost", 60000);
          BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(connectionToServer.getOutputStream(), StandardCharsets.UTF_8));
          Scanner sc = new Scanner(System.in)) {

            String line;
            while ((line = sc.nextLine()) != null) {
                writer.write((line + "\r\n"));
                writer.flush();
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
