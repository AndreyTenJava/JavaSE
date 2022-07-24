package Abstract.Engine;

public class Main {
    public static void main(String[] args) {

        FerrariEngine f1 = new FerrariEngine(6.3, 12, 650);
        FerrariEngine f2 = new FerrariEngine(4.5, 8, 485);
        FerrariEngine f3 = new FerrariEngine(3.9, 8, 457);
        FerrariEngine f4 = new FerrariEngine(6.0, 12,620);
        FerrariEngine f5 = new FerrariEngine(4.0, 8,480);
        RenaultEnigine r1 = new RenaultEnigine(2.0, 6, 219, 1.2);
        RenaultEnigine r2 = new RenaultEnigine(1.8, 6, 210,1.1);
        RenaultEnigine r3 = new RenaultEnigine(1.6, 6, 190,1.3);
        RenaultEnigine r4 = new RenaultEnigine(2.2, 6, 223,1.5);
        RenaultEnigine r5 = new RenaultEnigine(2.5, 6, 291, 1.8);

        Engine[] engines = {f1, f2, f3, f4, f5, r1, r2, r3, r4, r5};
        for (int i = 0; i < engines.length; i++){
            System.out.println(engines[i].getMaxSpeed());

        }

    }
}
