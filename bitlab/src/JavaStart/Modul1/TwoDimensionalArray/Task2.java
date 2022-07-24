package JavaStart.Modul1.TwoDimensionalArray;

//Программа должна поменять элементы диагоналей двумерного массива

import java.util.Scanner;

public class Task2 {
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

        int temp;
        for(int i=0; i< n; i++){
            temp=arr[i][n-1-i];
            arr[i][n-1-i]=arr[i][i];
            arr[i][i]=temp;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}