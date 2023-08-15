package com.workintech.library.main;

import com.workintech.library.book.Book;
import com.workintech.library.book.Library;
import com.workintech.library.enums.Availability;
import com.workintech.library.enums.Type;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Madam Bovery", "Gustave Flaubert", "Flaubert’s debut novel is a pioneering work of literary realism which faced obscenity " +
                "charges when it was originally published but is now considered a masterpiece.", Type.CLASSICS, 10, 300, Availability.AVAILABLE);
        Book book2 = new Book(2, "Madam Bovery", "Gustave Flaubert", "Flaubert’s debut novel is a pioneering work of literary realism which faced obscenity " +
                "charges when it was originally published but is now considered a masterpiece.", Type.CLASSICS, 12, 0, Availability.LOST);
        Book book3 = new Book(3, "Little Women","Louisa May Alcott","Thousands of teenagers around the world have fallen in love with " +
                "Marmee and her four daughters: Meg, Jo, Beth and Amy. ", Type.NOVEL, 15, 300, Availability.BORROWED);
        Book book4=new Book(4,"Pride and Prejudice","Jane Austen","It is a truth universally acknowledged that when most people think of Jane Austen they " +
                "think of this charming and humorous story of love, difficult families and the tricky task of finding a handsome husband with a good fortune.",Type.ROMANCE,13,350,Availability.AVAILABLE);
        Book book5=new Book(5,"Metamorphosis","Franz Kafka","Metamorphosis tells the story of salesman Gregor Samsa, who wakes one morning to find himself inexplicably " +
                "transformed into a huge insect and subsequently struggles to adjust to this new condition.",Type.SHORT_STORY,13,500,Availability.AVAILABLE);
        Book book6=new Book(6,"Metamorphosis","Franz Kafka","Metamorphosis tells the story of salesman Gregor Samsa, who wakes one morning to find himself inexplicably " +
                "transformed into a huge insect and subsequently struggles to adjust to this new condition.",Type.SHORT_STORY,13,500,Availability.AVAILABLE);
        Book book7=new Book(7,"Metamorphosis","Franz Kafka","Metamorphosis tells the story of salesman Gregor Samsa, who wakes one morning to find himself inexplicably " +
                "transformed into a huge insect and subsequently struggles to adjust to this new condition.",Type.SHORT_STORY,13,500,Availability.BORROWED);
        Book book8=new Book(8,"Metamorphosis","Franz Kafka","Metamorphosis tells the story of salesman Gregor Samsa, who wakes one morning to find himself inexplicably " +
                "transformed into a huge insect and subsequently struggles to adjust to this new condition.",Type.SHORT_STORY,13,0,Availability.LOST);
        Book book9=new Book(9,"Chess Story","Stefan Zweig","Travelers by ship from New York to Buenos Aires find that on board with them is the world champion of chess, " +
                "an arrogant and unfriendly man.",Type.SHORT_STORY,14,400,Availability.BORROWED);
        Book book10=new Book(10,"Chess Story","Stefan Zweig","Travelers by ship from New York to Buenos Aires find that on board with them is the world champion of chess, " +
                "an arrogant and unfriendly man.",Type.SHORT_STORY,14,400,Availability.AVAILABLE);
        Book book11=new Book(11,"Crime and Punishment","Fyodor Dostoyevsky","Living in a squalid room in St. Petersburg, the indigent but proud Rodion Raskolnikov believes he is above society."
                ,Type.CLASSICS,14,400,Availability.AVAILABLE);
        Book book12=new Book(12,"White Nights","Fyodor Dostoyevsky","A poignant tale of love and loneliness from Russia's foremost writer."
                ,Type.CLASSICS,14,400,Availability.AVAILABLE);
        Library database=new Library();
        database.addNewBook(book1);
        database.addNewBook(book2);
        database.addNewBook(book3);
        database.addNewBook(book4);
        database.addNewBook(book5);
        database.addNewBook(book6);
        database.addNewBook(book7);
        database.addNewBook(book8);
        database.addNewBook(book9);
        database.addNewBook(book10);
        database.addNewBook(book11);
        database.addNewBook(book12);




        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Select the section to process"
                        + "\n[1] Book"
                        + "\n[2] Member"
                        + "\n[0] Exit");
                int input = sc.nextInt();
                if (input < 0 || input > 2) {
                    System.out.println("Process must be between 0 to 2");
                }
                if (input == 0) {
                    System.exit(0);
                }
                if (input == 1) {
                    System.out.println("Select the operation"
                            + "\n[1] New Book Entry"
                            + "\n[2] List All Books"
                            + "\n[3] List Available Books"
                            + "\n[4] List Borrowed Books"
                            + "\n[5] List Lost Books"
                            + "\n[6] Search Book"
                            + "\n[0] Exit");
                    int input2 = sc.nextInt();
                    if (input2 < 0 || input2 > 7) {
                        System.out.println("Process must be between 0 to 6");
                    }
                    if (input2 == 0) {
                        System.exit(0);
                    }
                    if (input2 == 1) {
                        System.out.println("Enter Book Id");
                        int bookId = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Book Name");
                        String bookName = sc.nextLine();
                        System.out.println("Enter Book Writer");
                        String bookWriter = sc.nextLine();
                        System.out.println("Enter Book Description");
                        String bookDescription = sc.nextLine();
                        System.out.println("Enter Book Type");
                        Type bookType = Type.valueOf(sc.nextLine().toUpperCase());
                        System.out.println("Enter Depository");
                        double bookDepository = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Availability");
                        Availability bookAvailability = Availability.valueOf(sc.nextLine().toUpperCase());
                        Book bookNew=new Book(bookId,bookName,bookWriter,bookDescription,bookType,0,bookDepository,bookAvailability);
                        database.addNewBook(bookNew);
                        System.out.println(bookNew);
                    }
                    if (input2 == 2) {
                        System.out.println(database.getAllBooks());
                    }
                    if (input2 == 3) {
                        System.out.println(database.getAvailableBooks());
                    }
                    if (input2 == 4) {
                        System.out.println(database.getBorrowedBooks());
                    }
                    if (input2 == 5) {
                        System.out.println(database.getLostBooks());
                    }
                    if(input2==6){
                        System.out.println("Select Search Type"
                                + "\n[1] Book Name"
                                + "\n[2] Book Writer"
                                + "\n[0] Exit");
                        int input3= sc.nextInt();
                        if (input3 < 0 || input3 > 2) {
                            System.out.println("Process must be between 0 to 2");
                        }
                        if (input3 == 0) {
                            System.exit(0);
                        }
                        if(input3==1){
                            System.out.println("Enter Book Name");
                            sc.nextLine();
                            String bookName=sc.nextLine();
                            System.out.println(database.getByName(bookName));
                        }
                        if(input3==2){
                            sc.nextLine();
                            System.out.println("Enter Book Writer");
                            String bookWriter=sc.nextLine();
                            System.out.println(database.getByWriter(bookWriter));
                        }
                    }
                }
                if(input==2){
                    System.out.println("Birazdan......................");
                }
            } catch (Exception ex) {
                System.out.println("Invalid process: " + ex.getMessage());
                break;
            }
        }
    }
}
