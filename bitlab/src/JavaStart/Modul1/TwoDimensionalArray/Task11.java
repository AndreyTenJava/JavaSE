package JavaStart.Modul1.TwoDimensionalArray;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int min = Integer.MAX_VALUE;
        int[] maxN = new int [n];

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            maxN[i]=max;
        }
        for (int i = 0; i < n; i++) {
            if (maxN[i] < min) {
                min = maxN[i];
            }
        }
        System.out.println(min);
    }
}