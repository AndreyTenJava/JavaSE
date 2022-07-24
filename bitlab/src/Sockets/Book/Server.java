package Sockets.Book;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class Server {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "War and Peace", "L.N Tolstoy"));
        books.add(new Book(2, "Airport", "Artur Hailey"));
        books.add(new Book(3, "The green mile", "Stephen King"));

        try {
            ServerSocket server = new ServerSocket(2022);
            while (true) {
                Socket socket = server.accept();
                System.out.println("Client connected");
                ClientHandler ch = new ClientHandler(socket, books);
                ch.start();
            }
        }catch (Exception e) {
            e.printStackTrace();

        }
    }
}
