package de.theoptik.filetransfer;

import java.io.FileInputStream;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws Exception {
        try (var socket = new ServerSocket(8080);
             var client = socket.accept();
             var source = new FileInputStream("test-image.png")) {

            var imageBytes = source.readAllBytes();
            client.getOutputStream().write(imageBytes);
            client.getOutputStream().flush();
        }
    }
}
