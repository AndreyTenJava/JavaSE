package JavaStart.Modul1.If_else;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(num>=1 && num<=9){
            if(num%2==0){
                System.out.println("1 DIGIT, EVEN");
            }else {
                System.out.println("1 DIGIT, ODD");
            }
        }else if(num>=10 && num<=99){
            if(num%2==0){
                System.out.println("2 DIGIT, EVEN");
            }else {
                System.out.println("2 DIGIT, ODD");
            }
        }else if(num>=100 && num<=999){
            if(num%2==0){
                System.out.println("3 DIGIT, EVEN");
            }else {
                System.out.println("3 DIGIT, ODD");
            }
        }
    }
}
