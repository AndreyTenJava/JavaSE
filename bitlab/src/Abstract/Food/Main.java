package Abstract.Food;

public class Main {

    public static void main(String[] args) {
    Chocolate c1 = new Chocolate("Snickers",50);
    Chocolate c2 = new Chocolate("Twix",70);
    Burger b1 = new Burger("Burger King", 1,1);
    Burger b2 = new Burger("McDonald's", 2, 2);
    Coke coke1 = new Coke("Coca Cola", 400,true);
    Coke coke2 = new Coke("Fuse Tea", 100, false);

    Food[] foods = {c1, c2, b1, b2, coke1, coke2};
    for(int i = 0; i < foods.length; i++){
        System.out.println(foods[i].getName()+" "+foods[i].getCalories());
    }
    double max = Integer.MIN_VALUE;
    int index = 0;
    for(int i = 0; i < foods.length; i++){
        if(foods[i].getCalories() > max) {
            max = foods[i].getCalories();
            index = i;
        }

    }
        System.out.println("_______________________");
        System.out.print(foods[index].getName() + " " + max);

    }
}
