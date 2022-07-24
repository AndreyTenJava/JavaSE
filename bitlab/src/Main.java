import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        User [] users = new User[5];
        String text = "";
        int sum = 0;
        int age = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Insert Name: ");
            String name = in.next();

            System.out.println("Insert Surname: ");
            String surname = in.next();
            try {
                System.out.println("Insert age: ");
                age = in.nextInt();

            }catch (InputMismatchException e){
                age = 0;
                text += age;
            }
            if(text.equals("0")){
                String text2 = in.next();
            }

            text = "";

            users[i] = new User(name, surname, age);
            sum+=users[i].age;
        }
        System.out.println(sum/5);

    }
}
