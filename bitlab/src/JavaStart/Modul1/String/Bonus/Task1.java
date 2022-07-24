package JavaStart.Modul1.String.Bonus;

//Напишите программу, которая заменяет в тексте каждую вторую букву 'a' на букву 'о'.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
//        text = text.toLowerCase();
        int temp = 0;


        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                temp++;
                if (temp % 2 == 0) {
                    System.out.print('o');
                } else {
                    System.out.print('a');
                }
            } else if (text.charAt(i) == 'A') {
                temp++;
                if (temp % 2 == 0) {
                    System.out.print('O');
                } else {
                    System.out.print('A');
                }

            } else System.out.print(text.charAt(i));
        }
    }
}
