package JavaStart.Modul1.TwoDimensionalArray;

//Напишите программу, которая находит все неповторяющиеся элементы двумерного массива чисел.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){

                int count = 0;
                for (int k = 0; k < n; k++){
                    for (int l = 0; l < m; l++){
                        if (arr[i][j]==arr[k][l]){
                            count++;
                        }
                    }
                }
                if (count==1)
                    System.out.print(arr[i][j] + " ");
            }
        }
    }
}
