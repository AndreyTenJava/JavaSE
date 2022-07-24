package Inheritance.Car;

public class Toyota extends Car {

    String manufacturer;

    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer){
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    @Override
    public void ride(){
        super.ride();
        System.out.println(manufacturer);
    }
}
