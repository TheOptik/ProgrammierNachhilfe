package tcp.multithreaded;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    public static void main(String[] args) throws Exception {

        try (ServerSocket server = new ServerSocket(8080)) {
            while (true) {
                try (Socket client = server.accept()) {
                    new Thread(() -> {
                        try (BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream())); BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))) {
                            while (true) {
                                String line = reader.readLine();
                                writer.write(line);
                                writer.newLine();
                                writer.flush();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }).start();
                }
            }
        }
    }
}
