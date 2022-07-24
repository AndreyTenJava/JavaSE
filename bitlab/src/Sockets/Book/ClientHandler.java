package Sockets.Book;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread {
    private Socket socket;
    private ArrayList<Book> books;

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ClientHandler(Socket socket, ArrayList<Book> books) {
        this.socket = socket;
        this.books = books;


    }
    @Override
    public void run() {
        try {
            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            PackageData data = null;
            while ((data = (PackageData) inStream.readObject()) != null) {
                if(data.getOperationType().equals("ListBooks")){
                    PackageData pd = new PackageData("ListBooks", (ArrayList<Book>) books.clone(), null);
                    outputStream.writeObject(pd);
                }else if(data.getOperationType().equals("addBook")){
                    books.add(data.getBook());
                    setBooks(books);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
