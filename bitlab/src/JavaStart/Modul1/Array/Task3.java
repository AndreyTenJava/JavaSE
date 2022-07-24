package JavaStart.Modul1.Array;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] m = new int[n];

        for (int i = 0; i < n; i++) {
            m[i] = in.nextInt();
        }

        boolean isTrue = false;
        for(int i=0; i<n-1; i++){
            if(m[i]<0 && m[i+1]>0 || m[i]>0 && m[i+1]<0){
                isTrue=true;
            }else {
                isTrue=false;
                break;
            }
        }
        if(isTrue){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
