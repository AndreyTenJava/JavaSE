package JavaStart.Modul1.String.Practic;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        StringBuffer s2 = new StringBuffer(s1);

        for (int i = 0; i < s1.length(); i++) {
            if (Character.isLowerCase(s1.charAt(i))) {
                s2.setCharAt(i, Character.toUpperCase(s1.charAt(i)));
            } else if (Character.isUpperCase(s1.charAt(i))) {
                s2.setCharAt(i, Character.toLowerCase(s1.charAt(i)));
            }
        }
        System.out.println(s2);
    }
}
