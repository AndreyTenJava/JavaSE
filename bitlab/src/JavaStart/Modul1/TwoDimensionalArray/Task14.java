package JavaStart.Modul1.TwoDimensionalArray;

public class Task14 {
    public static void main(String[] args) {
        int array[][] = new int[10][10];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                array[i][j] = i*10+j+1;
            }
        }
        for (int i = 0; i < 10; i++){
            if (i%2==0){
                for (int j = 0; j < 10; j++){
                    System.out.print(array[i][j] + " ");
                }
            }
            if (i%2!=0){
                for (int j = 9; j >=0; j--){
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
