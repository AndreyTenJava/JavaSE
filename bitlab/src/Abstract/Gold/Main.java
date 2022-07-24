package Abstract.Gold;

public class Main {
    public static void main(String[] args) {
        SphereGold s1 = new SphereGold(1.1);
        SphereGold s2 = new SphereGold(2.2);
        SphereGold s3 = new SphereGold(3.3);
        CubeGold c1 = new CubeGold(4.4);
        CubeGold c2 = new CubeGold(5.5);
        CubeGold c3 = new CubeGold(5.5);
        GoldShape[] goldShapes = {s1, s2, s3, c1, c2, c3};
        for(int i = 0; i < goldShapes.length; i++){
            System.out.println(goldShapes[i].getPrice());
        }

    }
}
