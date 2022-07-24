package JavaStart.Modul1.TwoDimensionalArray;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int arr[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            int sum = 0;
            int count = 0;
            for (int j = 0; j < m; j++) {
                count++;
                sum += arr[i][j];
            }
            double res = sum*1.0/count;
            for (int j = 0; j < m; j++){
                if (arr[i][j]<res){
                    arr[i][j]=0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}