package Abstract.Food;

public class Burger extends Food {
    private int meatAmount;
    private int meatType;
    public Burger(){}

        public Burger(String name, int meatAmount, int meatType){
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;

        }

        public double getCalories(){
        int temp = 0;
        if(meatAmount == 1){
            temp = meatAmount * 840;
        }else if (meatType == 2){
            temp = meatType * 560;
        }

            return temp;
        }
}
