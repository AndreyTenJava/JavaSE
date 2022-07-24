package Abstract.Food;

public abstract class Food {
    private String name;

    public Food(){}

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getCalories();
}
