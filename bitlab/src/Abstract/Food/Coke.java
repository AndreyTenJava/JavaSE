package Abstract.Food;

public  class Coke extends Food {
    private double volumeLiters;
    private boolean isSparkling;

    public Coke(){}

    public Coke(String name, double volumeLiters, boolean isSparkling){
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    public double getCalories() {
    double temp = 0;
    if (isSparkling) {
        temp = volumeLiters * 400;
        return temp;
    } else {
        temp = volumeLiters * 100;
    }

    return temp;
}

}
