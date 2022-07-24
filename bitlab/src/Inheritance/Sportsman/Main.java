package Inheritance.Sportsman;

public class Main {
    public static void main(String[] args) {
        Gymnast sportsman1 = new Gymnast("Sabina Ashirbayeva", 23, "Kazakhstan",169, 53, "rhythmic gymnastics");
        Gymnast sportsman2 = new Gymnast("Angelina Melnikova", 21, "Russia", 151, 44, "multiathlon");
        Gymnast sportsman3 = new Gymnast("Simone Biles", 24, "USA", 142, 47, "multiathlon");

        Swimmer sportsman4 = new Swimmer("Dmitriy Balandin", 26, "Kazakhstan", "breaststroke", 2.07);
        Swimmer sportsman5 = new Swimmer("Joseph Schooling", 26, "Republic of Singapore", "butterfly", 50.39);
        Swimmer sportsman6 = new Swimmer("Kyle Chalmers", 23, "Australia", "freestyle", 47.58);

        Footballer sportsman7 = new Footballer("Yeldos Akhmetov", 31, "Kazakhstan", "fullback", "Kairat");
        Footballer sportsman8 = new Footballer("Islambek Kuat", 28, "Kazakhstan", "halfback", "Astana");
        Footballer sportsman9 = new Footballer("Igor Trofimec", 25, "Kazakhstan", "goalkeeper", "Shahter");

        OlympicGames sportsmen = new OlympicGames();
        sportsmen.sportsmenList = new Sportsman[]{sportsman1, sportsman2, sportsman3, sportsman4, sportsman5, sportsman6, sportsman7, sportsman8, sportsman9};

        for(int i = 0; i < 9; i++) {
            sportsmen.sportsmenList[i].play();
        }
    }
}

