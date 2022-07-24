package Inheritance.Sportsman;

public class Gymnast extends Sportsman {
    int height;
    int weight;
    String style;
    public Gymnast(String fullName, int age, String country, int height, int weight, String style){
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }
    @Override
    public void play(){
        super.play();
        System.out.println(" height: " + height + " weight: " + weight + " style: " + style + " does gymnastic");
    }
}
