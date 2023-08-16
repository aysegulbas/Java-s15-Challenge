package com.workintech.library.member;

import com.workintech.library.book.Book;

public interface Borrowable {
    boolean checkMemberStatus(int memberId);
    boolean checkBookAvailability(Book book);
    boolean checkDepository(int memberId,Book book);
}
