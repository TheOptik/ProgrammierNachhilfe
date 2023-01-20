package tcp.streams.objectstreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

import static tcp.streams.stringpayload.TcpServerWithStringPayload.PORT;

public class TcpClientWithObjectStream {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {

            Thread thread = new Thread(() -> {

                try (final Socket socket = new Socket("localhost", PORT)) {
                    System.out.println("connected to server!");

                    final OutputStream outputStream = socket.getOutputStream();
                    try (final ObjectOutputStream writer = new ObjectOutputStream(outputStream)) {

                        writer.writeObject(new ListPayload(List.of(1, 2, 3, 4, 5)));
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
