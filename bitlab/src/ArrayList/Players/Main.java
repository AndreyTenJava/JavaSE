package ArrayList.Players;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Players> players = new ArrayList<>();

        Players players1 = new Players("name1",3300000,34);
        players.add(players1);

        Players players2 = new Players("name2",3500000,35);
        players.add(players2);

        Players players3 = new Players("name3",2500000,21);
        players.add(players3);

        Players players4 = new Players("name4",2800000,30);
        players.add(players4);

        Players players5 = new Players("name5", 2600000,23);
        players.add(players5);

        Players players6 = new Players("name6",2900000,37);
        players.add(players6);

        Players players7 = new Players("name7", 3000000,27);
        players.add(players7);

        Players players8 = new Players("name8", 3200000,32);
        players.add(players8);

        Players players9 = new Players("name9", 1800000,18);
        players.add(players9);

        Players players10 = new Players("name10", 2500000,25);
        players.add(players10);

        double sumPrice = 0;
        double averagePrice = 0;
        int sumAge = 0;

        for(int i = 0; i < players.size(); i++){
            sumPrice += players.get(i).getPrice();
            averagePrice = sumPrice/10;
            sumAge += players.get(i).getAge();
        }
        System.out.println("AVG Prie: " + averagePrice + ", Sum Years: " + sumAge);


    }
}
