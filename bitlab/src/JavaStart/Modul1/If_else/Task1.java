package JavaStart.Modul1.If_else;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int b = in.nextInt();

        if(b==1){
            System.out.println(a/420);
        }else if(b==2){
            System.out.println(a/510);
        }else if(b==3){
            System.out.println(a/5.8);
        }
    }
}