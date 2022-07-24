package Inheritance.Car;

public class Car {
    String name;
    String model;
    int maxSpeed;
    int year;
    double volume;

    public Car (){}

    public Car (String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }
    public void ride(){
        System.out.println("Name: " + name + " model: " + model + " maxSpeed: " + maxSpeed + " volume: " + volume + " Car is riding");
    }
}
