package Abstract.Engine;

public class FerrariEngine extends Engine {
    public FerrariEngine() {
    }

    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    public double efficiency() {
        return 0.25;
    }

    public double throttleEnergy() {
        return getEngineVolume() * getCylinderAmount() * 100;
    }

    public double breakEnergy() {
        return getEngineWeight() * 2;
    }

}
