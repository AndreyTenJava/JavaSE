package Sockets.Book;

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
                System.out.println("PRESS 1 TO LIST BOOKS");
                System.out.println("PRESS 2 TO ADD BOOKS");
                System.out.println("PRESS 0 TO DISCONNECT FROM SERVER");

                int choice = in.nextInt();

                if(choice == 1){
                    PackageData pd = new PackageData("ListBooks", null, null);
                    outputStream.writeObject(pd);

                    PackageData pd2 = (PackageData) inputStream.readObject();

                    for(Book b: pd2.getBooks())
                    {
                        System.out.println(b.toString());
                    }

                }else if(choice == 2){
                    System.out.println("Inset id: ");
                    int id = in.nextInt();
                    System.out.println("Insert name: ");
                    String name = in.nextLine();
                    System.out.println("Insert author: ");
                    String author = in.nextLine();

                    Book b = new Book(id, name, author);
                    PackageData pd3 = new PackageData("addBook", null, b);
                    outputStream.writeObject(pd3);
                }else if(choice == 0){
                    System.exit(0);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}