package JavaStart.Modul1.String.Bonus;

import java.util.Scanner;

public class BonusTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

            System.out.println(s.substring(s.indexOf("<") + 1, s.indexOf(">")));

    }

}
