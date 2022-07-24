package Abstract.Gold;

public class SphereGold extends GoldShape{
    private double radius;

    public SphereGold() {}
    public SphereGold(double radius){
        this.radius = radius;
    }

    public double getVolume() {

        return 3.14 * radius * radius;
    }
}
