package Inheritance.Sportsman;

public class OlympicGames{
        String city;
        int year;
        Sportsman[]sportsmenList;


        public OlympicGames(){}

        public OlympicGames(String city, int year, Sportsman[] sportsmenList) {
                this.city = city;
                this.year = year;
                this.sportsmenList = sportsmenList;
        }

}
