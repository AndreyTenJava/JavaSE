package Serializable.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        while(true)
        {
            System.out.println(" PRESS [1] TO ADD STUDENT");
            System.out.println(" PRESS [2] TO LIST STUDENTS");
            System.out.println(" PRESS [0] TO EXIT");
            int choice = in.nextInt();

            if(choice == 1)
            {
                System.out.println("Name: ");
                String name = in.next();
                System.out.println("Surname: ");
                String surname = in.next();

                Student student = new Student (name, surname);


                while(true)
                {
                    System.out.println("PRESS [1] TO ADD SUBJECT: ");
                    System.out.println("PRESS [0] TO GO TO MAIN MENU: ");

                    int choice1 = in.nextInt();

                    if (choice1 == 1) {

                        System.out.println("name: ");
                        String name1 = in.next();
                        System.out.println("credits: ");
                        int credits = in.nextInt();

                        Subject pl = new Subject(name1, credits);
                        student.addSubject(pl);

                    } else if (choice1 == 0) {
                        break;
                    }
                }

                students.add(student);
                saveStudents(students);

            } else if(choice == 2)
            {
                students = getStudentList();

                for(Student s: students)
                    s.getData();
            }
            else if(choice == 0)
            {
                System.exit(0);
            }
            else
                System.out.println("We don't have that choice!!!");
        }
    }
    public static void saveStudents(ArrayList<Student> students)
    {
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("memory.dat"));
            outStream.writeObject(students);
            outStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Student> getStudentList()
    {
        ArrayList<Student> students = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("memory.dat"));
            students= (ArrayList) inputStream.readObject();
            inputStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return students;
    }
}
