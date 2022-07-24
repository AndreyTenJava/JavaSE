package JavaStart.Modul1.TwoDimensionalArray;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }int min = Integer.MAX_VALUE;
        int minI = 0;
        int minJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = minJ; j < m - 1; j++){
                arr[i][j] = arr[i][j+1];
            }
        }
        for (int i = minI; i < n - 1; i++){
            arr[i] = arr[i+1];
        }
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < m-1; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        int index1=0;
//        int index2=0;
//
//        int arr[][] = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = in.nextInt();
//            }
//        }
//        int min=arr[0][0];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(arr[i][j] < min){
//                    min=arr[i][j];
//                    index1=i;
//                    index2=j;
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            if(i != index1) {
//                for (int j = 0; j < m; j++) {
//                    if(j != index2){
//                        System.out.print(arr[i][j] + " ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }
//}