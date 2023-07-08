package tcp;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpStuff {

    public static void main(String[] args) throws Exception {

        Thread serverThread = new Thread(() -> {
            try {

                ServerSocket serverSocket = new ServerSocket(123456);

                while(true) {
                    Socket socketToClient = serverSocket.accept();

                    // rede mit neuem client
                }


            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        });

        serverThread.start();

        ////

        Socket socketToServer = new Socket("localhost", 123456);

        socketToServer.getInputStream();
        socketToServer.getOutputStream();


    }


}
