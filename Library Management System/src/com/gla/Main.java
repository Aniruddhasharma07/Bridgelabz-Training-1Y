package com.gla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        Admin admin = new Admin("Admin");

        Student student = new Student("Aman", 101, 2, Branch.BTECH);
        Faculty faculty = new Faculty("Dr Sharma", 201);

        while (true) {
            System.out.println("\n1 Add Book");
            System.out.println("2 Show Books");
            System.out.println("3 Issue Book to Student");
            System.out.println("4 Issue Book to Faculty");
            System.out.println("5 Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt(); sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.println("1 MATH 2 PSYCHOLOGY 3 BIOLOGY 4 CHEMISTRY");
                int c = sc.nextInt();

                BookCategory cat =
                        (c==1)?BookCategory.MATHEMATICS:
                                (c==2)?BookCategory.PSYCHOLOGY:
                                        (c==3)?BookCategory.BIOLOGY:
                                                BookCategory.CHEMISTRY;

                sc.nextLine();

                System.out.print("Author: ");
                String author = sc.nextLine();

                System.out.print("Publisher: ");
                String pub = sc.nextLine();

                System.out.print("Price: ");
                int price = sc.nextInt();

                Book book = new Book(id, name, cat, author, pub, price);
                admin.addBook(library, book);
            }

            else if (choice == 2) {
                admin.showBooks(library);
            }

            else if (choice == 3) {
                System.out.print("Book ID: ");
                int id = sc.nextInt();
                admin.issueBook(library, id, student);
            }

            else if (choice == 4) {
                System.out.print("Book ID: ");
                int id = sc.nextInt();
                admin.issueBook(library, id, faculty);
            }

            else {
                break;
            }
        }
    }
}