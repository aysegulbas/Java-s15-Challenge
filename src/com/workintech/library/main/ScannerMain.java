package com.workintech.library.main;

import com.workintech.library.book.Book;
import com.workintech.library.book.Library;
import com.workintech.library.enums.Availability;
import com.workintech.library.enums.Damage;
import com.workintech.library.enums.Status;
import com.workintech.library.enums.Type;
import com.workintech.library.member.Member;
import com.workintech.library.member.Subscription;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Madam Bovery", "Gustave Flaubert", "Flaubert’s debut novel is a pioneering work of literary realism which faced obscenity " +
                "charges when it was originally published but is now considered a masterpiece.", Type.CLASSICS, 10, 300, Availability.AVAILABLE);
        Book book2 = new Book(2, "Madam Bovery", "Gustave Flaubert", "Flaubert’s debut novel is a pioneering work of literary realism which faced obscenity " +
                "charges when it was originally published but is now considered a masterpiece.", Type.CLASSICS, 12, 0, Availability.LOST);
        Book book3 = new Book(3, "Little Women", "Louisa May Alcott", "Thousands of teenagers around the world have fallen in love with " +
                "Marmee and her four daughters: Meg, Jo, Beth and Amy. ", Type.NOVEL, 15, 300, Availability.BORROWED);
        Book book4 = new Book(4, "Pride and Prejudice", "Jane Austen", "It is a truth universally acknowledged that when most people think of Jane Austen they " +
                "think of this charming and humorous story of love, difficult families and the tricky task of finding a handsome husband with a good fortune.", Type.ROMANCE, 13, 350, Availability.AVAILABLE);
        Book book5 = new Book(5, "Metamorphosis", "Franz Kafka", "Metamorphosis tells the story of salesman Gregor Samsa, who wakes one morning to find himself inexplicably " +
                "transformed into a huge insect and subsequently struggles to adjust to this new condition.", Type.SHORT_STORY, 13, 500, Availability.AVAILABLE);
        Book book6 = new Book(6, "Metamorphosis", "Franz Kafka", "Metamorphosis tells the story of salesman Gregor Samsa, who wakes one morning to find himself inexplicably " +
                "transformed into a huge insect and subsequently struggles to adjust to this new condition.", Type.SHORT_STORY, 13, 500, Availability.AVAILABLE);
        Book book7 = new Book(7, "Metamorphosis", "Franz Kafka", "Metamorphosis tells the story of salesman Gregor Samsa, who wakes one morning to find himself inexplicably " +
                "transformed into a huge insect and subsequently struggles to adjust to this new condition.", Type.SHORT_STORY, 13, 500, Availability.BORROWED);
        Book book8 = new Book(8, "Metamorphosis", "Franz Kafka", "Metamorphosis tells the story of salesman Gregor Samsa, who wakes one morning to find himself inexplicably " +
                "transformed into a huge insect and subsequently struggles to adjust to this new condition.", Type.SHORT_STORY, 13, 0, Availability.LOST);
        Book book9 = new Book(9, "Chess Story", "Stefan Zweig", "Travelers by ship from New York to Buenos Aires find that on board with them is the world champion of chess, " +
                "an arrogant and unfriendly man.", Type.SHORT_STORY, 14, 400, Availability.BORROWED);
        Book book10 = new Book(10, "Chess Story", "Stefan Zweig", "Travelers by ship from New York to Buenos Aires find that on board with them is the world champion of chess, " +
                "an arrogant and unfriendly man.", Type.SHORT_STORY, 14, 400, Availability.AVAILABLE);
        Book book11 = new Book(11, "Crime and Punishment", "Fyodor Dostoyevsky", "Living in a squalid room in St. Petersburg, the indigent but proud Rodion Raskolnikov believes he is above society."
                , Type.CLASSICS, 14, 400, Availability.AVAILABLE);
        Book book12 = new Book(12, "White Nights", "Fyodor Dostoyevsky", "A poignant tale of love and loneliness from Russia's foremost writer."
                , Type.CLASSICS, 14, 400, Availability.AVAILABLE);

        Member member1=new Member(1,"Aysegul","Bas", Status.LIVE,5000);
        Member member2=new Member(2,"Aytac","Sahin",Status.LIVE,1000);
        Member member3=new Member(3,"Ihsan","Hazırel",Status.SUSPEND,2000);

        Library database = new Library();
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



        Subscription memberList=new Subscription();
        memberList.addNewMember(member1);
        memberList.addNewMember(member2);
        memberList.addNewMember(member3);

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
                            + "\n[7] Delete Book"
                            + "\n[0] Exit");
                    int input2 = sc.nextInt();
                    if (input2 < 0 || input2 > 8) {
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
                        Book bookNew = new Book(bookId, bookName, bookWriter, bookDescription, bookType, 0, bookDepository, bookAvailability);
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
                    if (input2 == 6) {
                        System.out.println("Select Search Type"
                                + "\n[1] Book Name"
                                + "\n[2] Book Writer"
                                + "\n[3] Book Id"
                                + "\n[0] Exit");
                        int input3 = sc.nextInt();
                        if (input3 < 0 || input3 > 3) {
                            System.out.println("Process must be between 0 to 2");
                        }
                        if (input3 == 0) {
                            System.exit(0);
                        }
                        if (input3 == 1) {
                            System.out.println("Enter Book Name");
                            sc.nextLine();
                            String bookName = sc.nextLine();
                            System.out.println(database.getByName(bookName));
                        }
                        if (input3 == 2) {
                            sc.nextLine();
                            System.out.println("Enter Book Writer");
                            String bookWriter = sc.nextLine();
                            System.out.println(database.getByWriter(bookWriter));
                        }
                        if (input3 == 3) {
                            System.out.println("Enter Book Id");
                            int bookId = sc.nextInt();
                            System.out.println(database.getBookById(bookId));
                        }
                    }
                    if (input2 == 7) {
                        System.out.println("Enter Book Id to Delete");
                        int bookId = sc.nextInt();
                        System.out.println(database.removeBookById(bookId));
                    }
                }
                if (input == 2) {
                    System.out.println("Select the operation"
                            + "\n[1] New Member Entry"
                            + "\n[2] List All Members"
                            + "\n[3] Search Member"
                            + "\n[4] Delete Member"
                            + "\n[5] Borrow Book"
                            + "\n[6] Return Book to Library"
                            + "\n[0] Exit"
                    );
                    int input4 = sc.nextInt();
                    if (input4< 0 || input4 > 6) {
                        System.out.println("Process must be between 0 to 6");
                    }
                    if (input4 == 0) {
                        System.exit(0);
                    }
                    if(input4==1){
                        System.out.println("Enter Member Id");
                        int memberId = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Member Name");
                        String memberName = sc.nextLine();
                        System.out.println("Enter Member Lastname");
                        String lastName = sc.nextLine();
                        System.out.println("Enter Member Status");
                        Status memberStatus = Status.valueOf(sc.nextLine().toUpperCase());
                        System.out.println("Enter Member Fee");
                        double memberFee = sc.nextDouble();
                        Member memberNew=new Member(memberId,memberName,lastName,memberStatus,memberFee);
                        memberList.addNewMember(memberNew);
                        System.out.println(memberNew);
                    }
                    if(input4==2){
                        System.out.println(memberList.getAllMembers());
                    }
                    if(input4==3){
                        sc.nextLine();
                        System.out.println("Enter Member Id");
                        int memberId = sc.nextInt();
                        System.out.println(memberList.getMemberById(memberId));
                    }
                    if (input4 == 4) {
                        System.out.println("Enter Member Id to Delete");
                        int memberDeleteId=sc.nextInt();
                        System.out.println(memberList.removeMemberById(memberDeleteId));
                    }
                    if(input4==5){
                        sc.nextLine();
                        System.out.println("Enter Member Id");
                        int memberId = sc.nextInt();
                        System.out.println("Enter Book Id");
                       int bookId=sc.nextInt();
                        Book book=database.getAllBooks().get(bookId);
                        memberList.borrowBook(memberId,book);
                        System.out.println(memberList.getMemberById(memberId));
                    }
                    if(input4==6){
                        System.out.println("Enter Member Id");
                        int memberId = sc.nextInt();
                        System.out.println("Enter Book Id");
                        int bookId=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Damage Ratio");
                        Damage damageRatio=Damage.valueOf(sc.nextLine().toUpperCase());
                        Book book=database.getAllBooks().get(bookId);
                        memberList.returnBook(memberId,book,damageRatio);
                        System.out.println(memberList.getMemberById(memberId));
                        System.out.println(database.getBookById(bookId));
                    }
                }
            } catch (Exception ex) {
                System.out.println("Invalid process: " + ex.getMessage());
                break;
            }
        }
    }
}
