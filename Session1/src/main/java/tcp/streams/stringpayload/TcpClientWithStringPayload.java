package tcp.streams.stringpayload;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import static tcp.streams.stringpayload.TcpServerWithStringPayload.PORT;

public class TcpClientWithStringPayload {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {

            Thread thread = new Thread(() -> {

                try (final Socket socket = new Socket("localhost", PORT)) {
                    System.out.println("connected to server!");

                    final OutputStream outputStream = socket.getOutputStream();
                    try (final PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream))) {

                        writer.println("1,2,3,4,5");
                        writer.flush();
                        System.out.println("message sent!");

                        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

                            System.out.println(reader.readLine());
                        }
                    }
                } catch (UnknownHostException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            thread.start();
        }
    }

}
