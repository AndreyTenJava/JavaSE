package Abstract.Engine;

public class RenaultEnigine extends Engine {
    private double extraTurboEnergy;

    public RenaultEnigine() {}

    public RenaultEnigine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public double getExtraTurboEnergy() {
        return extraTurboEnergy;
    }

    public void setExtraTurboEnergy(double extraTurboEnergy) {
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public double efficiency() {
        return 0.27;
    }

    public double throttleEnergy() {
        return getEngineVolume() * getCylinderAmount() * 110 + getExtraTurboEnergy();
    }

    public double breakEnergy() {
        return getEngineWeight() * 2.1;
    }
}
