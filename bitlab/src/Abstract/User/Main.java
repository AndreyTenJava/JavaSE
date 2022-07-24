package Abstract.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ERPSystem erp = new ERPSystem();
        int index = 0;

        while (true) {
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO LIST USER BY INDEX");
            System.out.println("PRESS [0] TO EXIT");
            String choice = in.next();

            if (choice.equals("1")) {
                erp = addUsers(in, erp, index);

            } else if (choice.equals("2")) {
                listUsers(erp, in);

            } else if (choice.equals("3")) {
                ListIdUser(erp, in);

            } else if (choice.equals("0")) {
                System.exit(0);

            }
        }
    }

    public static ERPSystem addUsers(Scanner in, ERPSystem syst, int ind) {
        System.out.println("PRESS [1] TO ADD STUDENT");
        System.out.println("PRESS [2] TO ADD TEACHER");
        String choice1 = in.next();
        if (choice1.equals("1")) {

            System.out.println("Login");
            String login = in.next();
            System.out.println("Password");
            String pass = in.next();
            System.out.println("Name");
            String name = in.next();
            System.out.println("Surname");
            String surname = in.next();
            System.out.println("Group");
            String group = in.next();
            System.out.println("GPA");
            double gpa = in.nextDouble();
            Student output= new Student(ind+1, login, pass, name, surname, group, gpa);
            syst.addUser(output);

        } else if (choice1.equals("2")) {

            System.out.println("Login");
            String login = in.next();
            System.out.println("Password");
            String pass = in.next();
            System.out.println("NickName");
            String nickName = in.next();
            System.out.println("Status");
            String status = in.next();
            Teacher teacher = new Teacher(ind + 1, login, pass, nickName, status);
            syst.addUser(teacher);
            while (true) {
                System.out.println("PRESS [1] TO ADD SUBJECT");
                System.out.println("PRESS [0] TO FINISH ADDING SUBJECT");
                String choice2 = in.next();
                if (choice2.equals("1")) {
                    System.out.println("Subject");
                    String sub = in.next();
                    teacher.addSubject(sub);
                } else if (choice2.equals("0")) {
                    break;
                } else {
                    System.out.println("ERROR");
                }
            }
        }
        return syst;
    }

    public static void listUsers(ERPSystem syst, Scanner os){
        syst.printAllUsers();
        System.out.println("=== Choose By Whom To Sort ===");
        System.out.println("PRESS [1] TO LIST STUDENTS\n" +
                           "PRESS [2] TO LIST TEACHERS");
        String choice3 = os.next();
        if (choice3.equals("1")){
            for (int i = 0; i < syst.sizeOfUsers; i++){
                if (syst.memory[i] instanceof Student){
                    syst.printUser(i);
                }
            }

        }else if (choice3.equals("2")){
            for (int i = 0; i < syst.sizeOfUsers; i++){
                if (syst.memory[i] instanceof Teacher){
                    syst.printUser(i);
                }
            }
        }
    }

    public static void ListIdUser(ERPSystem sys, Scanner os) {
        System.out.println("ID");
        int id = os.nextInt();
        sys.printUser(id);
    }
}