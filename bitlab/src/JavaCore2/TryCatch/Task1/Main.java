package JavaCore2.TryCatch.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        int sum = 0;

        User[] users = new User[5];
        for (int i = 0; i < users.length; i++) {
            System.out.print("Insert name user: ");
            String name = in.next();
            System.out.print("Insert surname user: ");
            String surname = in.next();

            try {
                System.out.print("Insert age user: ");
                age = in.nextInt();
            }
            catch (InputMismatchException e) {
                age = 0;
                String temp = in.next();
            }
            users[i] = new User(name, surname, age);

            sum += users[i].age;
        }
        for (int i = 0; i < users.length; i++){
            System.out.println(users[i].toString());
        }
        System.out.println("=== AVG ===");
        System.out.println("AVG: " + sum/users.length);
    }
}
