package JavaStart.Modul1.String.HomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        for (int i = 0; i < text.length(); i++){
            String subText = text.substring(i);
            if (subText.equalsIgnoreCase("one")){
                subText ="1";
            }
            if (subText.equalsIgnoreCase("two")){
                subText ="2";
            }
            if (subText.equalsIgnoreCase("three")){
                subText ="3";
            }if (subText.equalsIgnoreCase("four")){
                subText ="4";
            }if (subText.equalsIgnoreCase("five")){
                subText ="5";
            }if (subText.equalsIgnoreCase("six")){
                subText ="6";
            }if (subText.equalsIgnoreCase("seven")){
                subText ="7";
            }if (subText.equalsIgnoreCase("eight")){
                subText ="8";
            }if (subText.equalsIgnoreCase("nine")){
                subText ="9";
            }if (subText.equalsIgnoreCase("zero")){
                subText ="0";
            }
            System.out.print(subText + " ");
        }
    }
}
