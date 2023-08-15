package com.workintech.library.book;

import com.workintech.library.enums.Availability;
import com.workintech.library.enums.Type;

public class AvailableBook extends Book {
    private int floor;
    private String section;
    private int shelf;

    public AvailableBook(int id, String name, String writer, String description, Type type, int lastMemberId, double depository, Availability availability) {
        super(id, name, writer, description, type, lastMemberId, depository, availability);
        this.floor = floor;
        this.section = section;
        this.shelf = shelf;
    }

    public int getFloor() {
        String lowercase = getName().toLowerCase();
        char c = lowercase.charAt(0);
        if (c >= '0' && c < '3' || c >= 'a' && c < 'i') {
            floor = 6;
        } else if (c >= '3' && c < '6'  || c >= 'i' && c < 'o') {
            floor = 7;
        } else if (c >= '6' && c <= '9' || c >= 'o' && c <= 'z') {
            floor = 8;
        }
        return floor;
    }

    public String getSection() {
        String lowercase = getName().toLowerCase();
        char c = lowercase.charAt(0);
        if (c >= '0' && c < '3' || c >= 'a' && c < 'i') {
            section = "A";
        } else if (c >= '3' && c < '6' || c >= 'i' && c < 'o') {
            section = "B";
        } else if (c >= '6' && c <= '9' || c >= 'o' && c <= 'z') {
            section = "C";
        }
        return section;
    }

    public int getShelf() {
        String lowercase = getName().toLowerCase();
        char c = lowercase.charAt(0);
        if (c >= '0' && c < '3' || c >= 'a' && c < 'i') {
            shelf = 0;
        } else if (c >= '3' && c < '6'  && c < 6 || c >= 'i' && c < 'o') {
            shelf = 1;
        } else if (c >= '6' && c <= '9' || c >= 'o' && c <= 'z') {
            shelf = 2;
        }
        return shelf;
    }

//    @Override
//    public String toString() {
//        String result = super.toString();
//        StringBuilder builder = new StringBuilder();
//        builder.append("Floor: " + getFloor() + "\n");
//        builder.append("Section: " + getSection() + "\n");
//        builder.append("Shelf: " + getShelf() + "\n");
//        return result+builder.toString();
//    }


}
