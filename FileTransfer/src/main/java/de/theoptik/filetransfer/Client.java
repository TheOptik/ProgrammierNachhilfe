package de.theoptik.filetransfer;

import java.io.FileOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        try(var socket = new Socket("localhost",8080);
            var outputFile = new FileOutputStream("download.png")){

            var imageBytes = socket.getInputStream().readAllBytes();
            outputFile.write(imageBytes);
            outputFile.flush();

        }
    }
}
