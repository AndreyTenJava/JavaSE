package Abstract.Gold;

public abstract class GoldShape {
    public abstract double getVolume();

    public double getPrice() {
        return getVolume() * 250 + 1200;
    }

}
