package Serializable.Game;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("PRESS 1 TO CREATE GAME");
            System.out.println("PRESS 2 TO ADD PLAYER TO GAME");
            System.out.println("PRESS 3 TO PLAY GAME");
            System.out.println("PRESS 0 TO EXIT");

            int choice = in.nextInt();

            if(choice == 1){
                System.out.println("Game name: ");
                String gameName = in.next();
                System.out.println("IP address: ");
                String ipAddress = in.next();
                System.out.println("PORT: ");
                int port = in.nextInt();

                ArrayList<Players> players = new ArrayList<>();
                Game g = new Game(gameName, ipAddress, port, players);
                ArrayList<Game> games = getGameList();
                games.add(g);
                saveGame(games);

            }else if(choice == 2){
                System.out.println("CHOOSE GAME: ");
                ArrayList<Game> games = getGameList();
                for(int i = 0; i< games.size(); i++){
                    System.out.println(i + 1 + ") " + games.get(i).toString());
                }
                int choice1 = in.nextInt();
                System.out.println(games.get(choice1 - 1).toString());
                System.out.println("Nickname: ");
                String nickName = in.next();
                System.out.println("Rating: ");
                double rating = in.nextDouble();
                Players pl = new Players(nickName, rating);
                games.get(choice1 - 1).addPlayer(pl);
                saveGame(games);

            }else if(choice == 3){
                ArrayList<Game> games = getGameList();
                if(games.size() == 0){
                    System.out.println("There is no such game");
                }else{
                    for(int i = 0; i < games.size(); i++){
                        System.out.println(games.get(i).toString());
                    }
                }
            }else if(choice == 0){
                System.exit(0);
            }else{
                System.out.println("Wrong command!!!");
            }
        }
    }

    public static void saveGame(ArrayList<Game> game){
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("settings.data"));
            outStream.writeObject(game);
            outStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Game> getGameList(){
        ArrayList<Game> game = new ArrayList<>();

        try{
            ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("settings.data"));
            game = (ArrayList) inStream.readObject();
            inStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return game;
    }
}
