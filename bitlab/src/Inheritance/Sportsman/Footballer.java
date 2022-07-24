package Inheritance.Sportsman;

public class Footballer extends Sportsman {
    String position;
    String club;
    public Footballer(String fullName, int age, String country, String position, String club){
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    @Override
    public void play() {
        super.play();
        System.out.println(" position: " + position + " club: " + club + " plays football");
    }
}
