package Abstract.Food;

public class Chocolate extends Food {
    private int weight;
    public Chocolate(){}

    public Chocolate(String name, int weight){
        super(name);
        this.weight = weight;
    }

    public double getCalories(){

        return weight * 740;
    }
}
