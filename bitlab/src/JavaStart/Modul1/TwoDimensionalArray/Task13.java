package JavaStart.Modul1.TwoDimensionalArray;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, index1, index2, temp;
        for (int i = 0; i < m; i++){
            max = arr[0][i];
            index1 = 0;
            min = arr[0][i];
            index2 = 0;
            for (int j = 0; j < n; j++){
                if (arr[j][i] > max){
                    max = arr[j][i];
                    index1 = j;
                }
                if (arr[j][i] < min){
                    min = arr[j][i];
                    index2 = j;
                }
            }
            temp = arr[index1][i];
            arr[index1][i] = arr[index2][i];
            arr[index2][i] = temp;
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
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
//        int array[][] = new int[n][m];
//        for(int i=0;i< array.length;i++){
//            for(int j =0;j<array[i].length;j++){
//                array[i][j]=in.nextInt();
//            }
//        }
//        for(int i=0;i<m;i++){
//            int max = -999;
//            int min = 999;
//            int index1 = 0;
//            int index2 = 0;
//            int index3= 0;
//            int index4 = 0;
//            for(int j=0;j<n;j++){
//                if(max<array[j][i]){
//                    max=array[j][i];
//                    index1 = j;
//                    index2 = i;
//                }
//                if(min>array[j][i]){
//                    min=array[j][i];
//                    index3=j;
//                    index4=i;
//                }
//            }
//            array[index1][index2]=min;
//            array[index3][index4]=max;
//        }
//        for(int i =0;i< array.length;i++){
//            for(int j=0;j<array[i].length;j++){
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}