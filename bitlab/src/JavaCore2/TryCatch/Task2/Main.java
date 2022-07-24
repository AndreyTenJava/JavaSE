package JavaCore2.TryCatch.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(1, "name1", "author1");
        Book book2 = new Book(2, "name2", "author2");
        Book book3 = new Book(3, "name3", "author3");
        Book book4 = new Book(4, "name4", "author4");
        Book book5 = new Book(5, "name5", "author5");

        Library library = new Library("name", "city");
        System.out.println("NAME LIBRARY: " + library.getName() + ", CITY: " + library.getCity());
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.printBooks();

        Library library1 = new Library("name1", "city1");
        System.out.println("NAME LIBRARY: " + library1.getName() + ", CITY: " + library1.getCity());
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);

        library1.printBooks();
    }
}

//        Scanner in = new Scanner(System.in);
//        Library library = new Library();
//        int index = 0;
//
//        while (true) {
//            System.out.println("""
//                    PRESS [1] TO ADD BOOK
//                    PRESS [2] TO LIST BOOK
//                    PRESS [0] TO EXIT""");
//
//            String choice = in.next();
//
//            if (choice.equals("1")) {
//                library = addBook(in, library, index);
//            } else if (choice.equals("2")) {
//                library = printBooks(library);
//            } else if (choice.equals("0")) {
//                System.exit(0);
//            }
//        }
//    }
//
//
//
//    public static Library addBook(Scanner sc, Library lib, int ind) {
//        System.out.println("Insert name book: ");
//        String name = sc.next();
//        System.out.println("Insert author book: ");
//        String author = sc.next();
//        Book book = new Book(ind+1, name, author);
//        lib.addBook(book);
//
//        return lib;
//    }
//
//    public static Library printBooks(Library lib) {
//        for (int i = 0; i < lib.index; i ++) {
//            lib.printBooks();
//        }
//        return lib;
//    }
//}

