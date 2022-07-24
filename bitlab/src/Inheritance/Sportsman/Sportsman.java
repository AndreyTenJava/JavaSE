package Inheritance.Sportsman;

public class Sportsman {

    String fullName;
    int age;
    String country;

    public Sportsman(){}

    public Sportsman(String fullName, int age, String country){
        this.fullName = fullName;
        this.age = age;
        this.country = country;

    }
    public void play(){
        System.out.println("fullName: " + fullName + " age: " + age + " country: " + country);
    }
}
