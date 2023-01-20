package tcp.streams.stringpayload;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;

public class TcpServerWithStringPayload {

    public static final int PORT = 30_000;

    public static void main(String[] args) throws IOException {

        try (final ServerSocket tcpServer = new ServerSocket(PORT)) {

            while (true) {

                // hier können wir kein try-with-resource verewnden, weil die Resource sonst am ende der while-schleife
                // geschlossen werden würde.
                // wir verwenden die Resource aber noch im gespawnten Thread.
                final Socket clientSocket = tcpServer.accept();
                    System.out.println("new client accepted!");

                    final var clientThread = new Thread(() -> {
                        //TODO: noch mal mit ObjectInputStream
                        try (final BufferedReader clientReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

                            System.out.println("waiting for message....");
                            final String clientMessage = clientReader.readLine();

                            System.out.println("new message recieved!");
                            System.out.println(clientMessage);
                            Thread.sleep(10_000);

                            final List<Boolean> response = getListOfIntegers(clientMessage).stream()
                              .map(number -> isNumberPrime(number))
                              .toList();

                            try (final PrintWriter writer = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()))) {
                                writer.println(response.toString());
                                writer.flush();
                            }

                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        try {
                            clientSocket.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });

                    clientThread.start();

            }
        }

    }

    public static boolean isNumberPrime(int number) {
        if (number == 1 || number == 2) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static List<Integer> getListOfIntegers(String clientMessage) {
        return Arrays.stream(clientMessage.split(",")).map(numberAsString -> Integer.parseInt(numberAsString)).toList();
    }

}
