package chatbot;

import java.io.*;
import java.net.*;

public class Moksh {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Moksh is online...");
            System.out.println("Waiting for Computer...");

            Socket socket = serverSocket.accept();

            System.out.println("Computer connected!");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));


            while (true) {

                String computerMessage = input.readLine();

                if (computerMessage == null || computerMessage.equalsIgnoreCase("q")) {
                    System.out.println("Computer ended the chat.");
                    break;
                }

                System.out.println("Computer: " + computerMessage);


                System.out.print("Moksh: ");
                String mokshMessage = keyboard.readLine();

                output.println(mokshMessage);


                if (mokshMessage.equalsIgnoreCase("q")) {
                    System.out.println("Moksh ended the chat.");
                    break;
                }
            }


            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}