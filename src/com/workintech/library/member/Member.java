package com.workintech.library.member;

import com.workintech.library.book.Book;
import com.workintech.library.enums.Status;

import java.util.Arrays;
import java.util.Objects;

public class Member {
    private int memberId;
    private String name;
    private String lastName;
    private Status status;
    private int[] borrowedBooks;
    private double memberFee;
    private Book book;

    public Member(int memberId, String name, String lastName, Status status, double memberFee) {
        this.memberId = memberId;
        this.name = name;
        this.lastName = lastName;
        this.status = status;
        this.borrowedBooks = new int[5];
        this.memberFee = memberFee;
    }

    public int getMemberId() {
        return memberId;
    }

    public int[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public Status getStatus() {
        return status;
    }

    public double getMemberFee() {
        return memberFee;
    }

    public void setMemberFee(Book book) {
        this.memberFee = memberFee-book.getDepository();
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setBorrowedBooks(int[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void addMemberFee(double fee){
        this.memberFee=memberFee+fee;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memberId == member.memberId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId);
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append("memberId:" + memberId +"\n");
        builder.append("Name:" + name +"\n");
        builder.append("LastName:" + lastName +"\n");
        builder.append("Status:" + status +"\n");
        builder.append("BorrowedBooks:" + Arrays.toString(borrowedBooks) +"\n");
        builder.append("MemberFee:" + memberFee +"\n");

        return builder.toString();
    }
}
