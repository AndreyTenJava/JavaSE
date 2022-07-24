package Inheritance.Sportsman;

public class Swimmer extends Sportsman {
    String style;
    double recordTime;
    public Swimmer(String fullName, int age, String country, String style, double recordTime){
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }
    @Override
    public void play(){
        super.play();
        System.out.println(" style: " + style + " recordTime: " + recordTime + " swims");
    }
}
