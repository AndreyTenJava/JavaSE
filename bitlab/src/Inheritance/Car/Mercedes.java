package Inheritance.Car;

public class Mercedes extends Car {

    String classType;

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    @Override
    public void ride() {
        super.ride();
        System.out.println(classType);
    }
}
