package JavaStart.Modul1.For_while;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();

        for (int i=a; i<=b; i++){
            if(i%d==c){
                System.out.print(i+ " ");
            }
        }
    }
}
