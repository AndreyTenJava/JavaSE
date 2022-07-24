package JavaStart.Modul1.TwoDimensionalArray;

import java.util.Scanner;

public class Task16 {
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

        for (int i = 0; i < n; i++) {
            int sum = 0, count = 0;
            for (int j = 0; j < m; j++) {
                sum+=arr[i][j];
                if(arr[i][j] == 0){
                    System.out.println("n");
                    break;
                }
                count++;
            }
            if(count == m){
                System.out.println(sum);
            }
        }
    }
}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n =in.nextInt();
//        int m = in.nextInt();
//
//        int[][] arr = new int[n][m];
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                arr[i][j] = in.nextInt();
//            }
//        }
//
//        for(int i=0; i<n; i++){
//            int sum = 0;
//            boolean check = true;
//            for(int j=0; j<m; j++){
//                if(arr[i][j] != 0){
//                    sum += arr[i][j];
//                }else {
//                    check = false;
//                }
//            }
//            if(check){
//                System.out.println(sum);
//            }else {
//                System.out.println("n");
//            }
//        }
//    }
//}