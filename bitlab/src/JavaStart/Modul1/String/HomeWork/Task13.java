package JavaStart.Modul1.String.HomeWork;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String s ="";
        for(int i =0; i<str.length();i++) {
            if (Character.isLowerCase(str.charAt(i))){
                if(i==0 || str.charAt(i-1)==' '){
                    s+=Character.toUpperCase(str.charAt(i));
                    System.out.print(s);
                    s="";
                }
                else System.out.print(str.charAt(i));
            }
            else System.out.print(" ");
        }
    }
}