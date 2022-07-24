package Inheritance.Phone;

public class Phone {
    String name;
    String model;
    int price;
    public Phone (){}

        public Phone (String name, String model, int price){
            this.name = name;
            this.model = model;
            this.price = price;
    }
    public boolean getData(){
        System.out.println("Name: " +name+ ", model: " +model+ ", price: " +price);
        return false;
    }

}
