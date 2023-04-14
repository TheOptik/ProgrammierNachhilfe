import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpServer {

    public static void main(String[] args) {

        try (ServerSocket tcpServer = new ServerSocket(60000);
          Socket clientSocket = tcpServer.accept()) {

            System.out.println("Client has connected!");

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(), StandardCharsets.UTF_8));
              BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream(), StandardCharsets.UTF_8))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    writer.write("OK\r\n");
                    writer.flush();
                }

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
