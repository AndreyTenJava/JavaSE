package ServerSocket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your User name");
        String userName = in.next();

        try {
            Socket socket = new Socket("127.0.0.1", 2022);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while (true) {
                System.out.println("PRESS [1] TO SEND MESSAGE");
                System.out.println("PRESS [2] TO EXIT");

                int choice = in.nextInt();

                if (choice == 1) {

                    System.out.println("Insert message text:");
                    String messageText = in.next();
                    String Date = "";
                    MessageData md = new MessageData(userName, messageText);
                    outputStream.writeObject(md);
                    if ((md = (MessageData) inputStream.readObject()) != null) {
                        System.out.println(md.getMessageText());
                    }
                }else if(choice == 2) {
                    System.exit(0);
                }
            }
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }


