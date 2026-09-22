package chatbot;


import java.io.*;
import java.net.*;

public class Computer {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 5000);

            System.out.println("Connected with Moksh!");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));


            while (true) {

                System.out.print("Computer: ");
                String computerMessage = keyboard.readLine();

                output.println(computerMessage);


                if (computerMessage.equalsIgnoreCase("q")) {
                    System.out.println("Computer ended the chat.");
                    break;
                }


                String mokshMessage = input.readLine();

                if (mokshMessage == null || mokshMessage.equalsIgnoreCase("q")) {
                    System.out.println("Moksh ended the chat.");
                    break;
                }

                System.out.println("Moksh: " + mokshMessage);
            }


            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}