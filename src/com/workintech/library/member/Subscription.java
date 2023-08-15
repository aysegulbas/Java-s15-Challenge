package com.workintech.library.member;

import com.workintech.library.book.Book;
import com.workintech.library.enums.Availability;
import com.workintech.library.enums.Damage;
import com.workintech.library.enums.Status;

import java.util.*;

public class Subscription {
    private LinkedList memberList;
    private Book book;

    public Subscription() {
        this.memberList = new LinkedList();
    }

    public void addNewMember(Member member) {
        if (!memberList.contains(member)) {
            memberList.add(member);
        }
    }

    public Map<Integer, Member> getAllMembers() {
        Map<Integer, Member> allMemberMap = new HashMap<>();
        Iterator iterator = memberList.iterator();
        while (iterator.hasNext()) {
            Member member = (Member) iterator.next();
            allMemberMap.put(member.getMemberId(), member);
        }
        return allMemberMap;
    }
public boolean checkMemberStatus(int memberId){
    Member member = getAllMembers().get(memberId);
    return member.getStatus().name().equals(Status.LIVE.name());

}
    public boolean checkBookAvailability(Book book){
        return book.getAvailability().name().equals(Availability.AVAILABLE.name());
    }

public boolean checkDepository(int memberId,Book book){
    Member member = getAllMembers().get(memberId);
    return member.getMemberFee()>= book.getDepository();
}

    public void borrowBook(int memberId, Book book) {
        Member member = getAllMembers().get(memberId);
//        while (iterator.hasNext()) {
//            Member member = (Member) iterator.next();
        try {
            if (member.getMemberId() == memberId && checkMemberStatus(memberId) &&checkBookAvailability(book) && checkDepository(memberId,book)) {
                int[] bookList = member.getBorrowedBooks();
                for (int i = 0; i < 5; i++) {
                    if (bookList[i] == 0) {
                        bookList[i] = book.getId();
                        member.setMemberFee(book);
//                        if(bookList[i]==4){member.setStatus(Status.SUSPEND);}
                        book.setAvailability(Availability.BORROWED);
                        book.setLastMemberId(memberId);
                        break;
                    }
                    else {
                        System.out.println("The member reach to the borrowing limit");
                    }

                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("The member can not borrow a book");
        }
//        }
    }

    public void returnBook(int memberId, Book book, Damage damage) {

        Map<Integer, Member> memberIdMap = getAllMembers();
        Iterator iterator = memberIdMap.values().iterator();
        Member member = memberIdMap.get(memberId);
//        while (iterator.hasNext()) {
//            Member member = (Member) iterator.next();
        int[] bookList = member.getBorrowedBooks();
        if (member.getMemberId() == memberId) {
            int index = -1;
            for (int i = 0; i < bookList.length; i++) {
                if (bookList[i] == book.getId()) {
                    index = i;
                    break;
                }
            }
            bookList[index] = 0;
            member.setBorrowedBooks(bookList);
            double returnDeposit = book.calculateDamage(damage);
            member.addMemberFee(returnDeposit);
            book.setDepository(returnDeposit);
            if (damage.name() == Availability.LOST.name()) {
                book.setAvailability(Availability.LOST);

            } else {
                book.setAvailability(Availability.AVAILABLE);

            }

        }
//        }
    }
}
