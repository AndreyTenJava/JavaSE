package JavaStart.Modul1.TwoDimensionalArray;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n%2==0) {
                    if (i<n/2) {
                        System.out.print(arr[i + n / 2][j] + " ");
                    }else {
                        System.out.print(arr[i - n / 2][j] + " ");
                    }
                } else if (n%2==1) {
                    if (i<n/2) {
                        System.out.print(arr[i+n/2+1][j] + " ");
                    } else if (i==n/2) {
                        System.out.print(arr[i][j] + " ");
                    }else {
                        System.out.print(arr[i-n/2-1][j] + " ");
                    }
                }
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
//        int arr[][] = new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                arr[i][j] = in.nextInt();
//            }
//        }
//
//        int center = n/2+1;
//
//        if(n%2==0){
//            center = n/2;
//        }
//        for(int i=0;i<n/2;i++){
//            int subArray[] = arr[i];
//            arr[i] = arr[center+i];
//            arr[center+i] = subArray;
//        }
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}