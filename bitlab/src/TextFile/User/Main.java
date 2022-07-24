package TextFile.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("PRESS [1] TO ADD USERS");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO DELETE USERS");
            System.out.println("PRESS [4] TO EXIT");

            String choice = in.next();
            if(choice.equals("1")){
                System.out.println("Insert Id: ");
                int id = in.nextInt();
                System.out.println("Insert Login: ");
                String login = in.next();
                System.out.println("Insert Password: ");
                String password = in.next();
                User u = new User(id, login, password);
                ArrayList<User> users = getUsersList();
                users.add(u);
                saveUsersList(users);
            }else if(choice.equals("2")){
                ArrayList<User> users = getUsersList();
                for(int i = 0; i < users.size(); i++){
                    System.out.println((i+1) + ") " + users.get(i));
                }
            }else if(choice.equals("3")){
                ArrayList<User> users = getUsersList();
                for(int i = 0; i < users.size(); i++){
                    System.out.println((i+1) + ") " + users.get(i));
                }
                System.out.println("Insert index of user to delete: ");
                int index = in.nextInt();
                users.remove(index - 1);
                saveUsersList(users);
            }else if(choice.equals("4")){
                System.exit(0);
            }else{
                System.out.println("Wrong command!!!");
            }
        }
    }
    public static ArrayList <User> getUsersList() {
        ArrayList<User> users = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("memory.txt"));
            String id = "";
            while ((id = br.readLine())!=null){
                String login = br.readLine();
                String password = br.readLine();
                users.add(new User(Integer.parseInt(id), login, password));
            }
        } catch (Exception e){
                e.printStackTrace();
        }
        return users;
    }

   public static void saveUsersList(ArrayList<User> users) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("memory.txt"));
            for(User u: users){
                bw.write(u.getId() + "\n");
                bw.write(u.getLogin() + "\n");
                bw.write(u.getPassword() + "\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
