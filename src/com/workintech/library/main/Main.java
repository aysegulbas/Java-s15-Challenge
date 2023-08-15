package com.workintech.library.main;

import com.workintech.library.book.AvailableBook;
import com.workintech.library.book.Book;
import com.workintech.library.book.Library;
import com.workintech.library.enums.Availability;
import com.workintech.library.enums.Damage;
import com.workintech.library.enums.Status;
import com.workintech.library.enums.Type;
import com.workintech.library.member.Member;
import com.workintech.library.member.Subscription;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Book book1=new Book(1,"Madam Bovery","Gustave Flaubert","Flaubert’s debut novel is a pioneering work of literary realism which faced obscenity " +
                "charges when it was originally published but is now considered a masterpiece.", Type.CLASSICS,10,300,Availability.AVAILABLE);

       Book book2=new AvailableBook(2,"Madam Bovery","Gustave Flaubert","Flaubert’s debut novel is a pioneering work of literary realism which faced " +
               "obscenity charges when it was originally published but is now considered a masterpiece.",Type.CLASSICS,8,300,Availability.AVAILABLE);
        Book book3=new AvailableBook(3,"Madam Bovery","Gustave Flaubert","Flaubert’s debut novel is a pioneering work of literary realism which faced " +
                "obscenity charges when it was originally published but is now considered a masterpiece.",Type.CLASSICS,8,300,Availability.AVAILABLE);
        Book book4=new AvailableBook(4,"Madam Bovery","Gustave Flaubert","Flaubert’s debut novel is a pioneering work of literary realism which faced " +
                "obscenity charges when it was originally published but is now considered a masterpiece.",Type.CLASSICS,8,300,Availability.AVAILABLE);
        Book book5=new AvailableBook(5,"Madam Bovery","Gustave Flaubert","Flaubert’s debut novel is a pioneering work of literary realism which faced " +
                "obscenity charges when it was originally published but is now considered a masterpiece.",Type.CLASSICS,8,300,Availability.AVAILABLE);
        Book book6=new AvailableBook(6,"Madam Bovery","Gustave Flaubert","Flaubert’s debut novel is a pioneering work of literary realism which faced " +
                "obscenity charges when it was originally published but is now considered a masterpiece.",Type.CLASSICS,8,1500,Availability.AVAILABLE);
        Book book7=new AvailableBook(7,"Madam Bovery","Gustave Flaubert","Flaubert’s debut novel is a pioneering work of literary realism which faced " +
                "obscenity charges when it was originally published but is now considered a masterpiece.",Type.CLASSICS,8,300,Availability.AVAILABLE);
        Book book8=new AvailableBook(8,"Madam Bovery","Gustave Flaubert","Flaubert’s debut novel is a pioneering work of literary realism which faced " +
                "obscenity charges when it was originally published but is now considered a masterpiece.",Type.CLASSICS,8,500,Availability.AVAILABLE);
        Book book9=new AvailableBook(9,"Madam Bovery","Gustave Flaubert","Flaubert’s debut novel is a pioneering work of literary realism which faced " +
                "obscenity charges when it was originally published but is now considered a masterpiece.",Type.CLASSICS,8,500,Availability.LOST);
        Member member1=new Member(1,"Aysegul","Bas", Status.LIVE,5000);


        Library database=new Library();
        database.addNewBook(book1);
        database.addNewBook(book2);
        System.out.println("--------------");
        System.out.println(database.getByName("Gustave Flaubert"));
        System.out.println(database.getAllBooks());
        Subscription memberList=new Subscription();
        memberList.addNewMember(member1);
        System.out.println("!!!!!!!!!!!!!");
        System.out.println(book1.calculateDamage(Damage.LOW));
//        System.out.println(member1);
//        memberList.borrowBook(1,book2);
//        System.out.println(member1);
//        System.out.println(book2);
//        memberList.returnBook(1,book2,Damage.LOW);
//        System.out.println(member1);
//     memberList.borrowBook(1,book2);
//     System.out.println(member1);
//     memberList.returnBook(1,book2,Damage.HIGH);
//     System.out.println(member1);
//     System.out.println(book2);
//     System.out.println("__________________");
//     memberList.borrowBook(1,book2);
//     System.out.println(member1);
//     memberList.returnBook(1,book2,Damage.MEDIUM);
//     System.out.println(member1);
//     System.out.println(book2);
//     memberList.borrowBook(1,book2);
//     System.out.println(book2);
     System.out.println(book1);
     System.out.println(book2);
     memberList.borrowBook(1,book2);
     System.out.println(book2);
     memberList.returnBook(1,book2,Damage.LOST);
        System.out.println(book2);
//        memberList.borrowBook(1,book1);
//        System.out.println(member1);
        System.out.println(member1);
        database.addNewBook(book3);
        memberList.borrowBook(1,book1);
        memberList.borrowBook(1,book3);
        System.out.println(member1);
        database.addNewBook(book4);
        database.addNewBook(book5);
        database.addNewBook(book6);
        database.addNewBook(book7);
        memberList.borrowBook(1,book4);
        memberList.borrowBook(1,book5);
        memberList.borrowBook(1,book6);
        memberList.borrowBook(1,book7);
        System.out.println(member1);
        memberList.returnBook(1,book6,Damage.MEDIUM);
        System.out.println(member1);
        memberList.returnBook(1,book5,Damage.LOST);
        System.out.println(member1);
        System.out.println(book5);
        memberList.returnBook(1,book4,Damage.LOST);
        System.out.println(member1);
        System.out.println(book4);
        System.out.println(database.getLostBooks());
        memberList.borrowBook(1,book7);
        System.out.println(member1);
        System.out.println(book7);
        System.out.println("???????????????");
        memberList.borrowBook(1,book4);
        System.out.println(member1);
        System.out.println(book4);
        memberList.borrowBook(1,book5);
        System.out.println(member1);
        System.out.println(database.getLostBooks());
        System.out.println(database.getByName("Madam Bovery"));




    }
}