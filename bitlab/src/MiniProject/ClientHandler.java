package MiniProject;

import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread {
    private Socket socket;
    private ArrayList<Students> students;

    public Socket socket(){
        return socket;
    }

    public void setSocket (Socket socket){
        this.socket = socket;
    }

    public ArrayList<Students> students(){
        return students;
    }

    public void setStudents(ArrayList<Students> students){
        this.students = students;
    }

    public ClientHandler(Socket socket, ArrayList<Students> students){
        this.socket = socket;
        this.students = students;
    }

    @Override
    public void run() {
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
