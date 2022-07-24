package JavaStart.Modul1.If_else;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose your branch: ");
        System.out.println("1 - Science, 2 - Humanitarian subjects, 3 - Art, 4 - Sport: ");
        int choose = in.nextInt();

        if(choose==1){
            System.out.println("1 - Match, 2 - Physics: ");
            int choose1 = in.nextInt();
            if(choose1==1){
                System.out.println("You are Financier");
            }else if(choose1==2){
                System.out.println("You are Engineer");
            }
        }else if(choose==2){
            System.out.println("1 - History, 2 - Foreign Languages: ");
            int choose2 = in.nextInt();
            if(choose2==1){
                System.out.println("You are Historic or Diplomat");
            }else if(choose2==2){
                System.out.println("You are Translator");
            }
        }else if(choose==3){
            System.out.println("1 - Drawing, 2 - Singing: ");
            int choose3 = in.nextInt();
            if(choose3==1){
                System.out.println("You are Painter or Architect");
            }else if(choose3==2){
                System.out.println("You are Singer or Tamada");
            }
        }else if(choose==4){
            System.out.println("1 - Team, 2 - Individual: ");
            int choose4 = in.nextInt();
            if(choose4==1){
                System.out.println("You are footballer or Basketball player");
            }else if(choose4==2){
                System.out.println("You are boxer or tennis player");
            }
        }
    }
}