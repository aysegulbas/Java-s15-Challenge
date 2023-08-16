package com.workintech.library.book;

import com.workintech.library.enums.Availability;
import com.workintech.library.enums.Damage;
import com.workintech.library.enums.Status;
import com.workintech.library.enums.Type;

import java.util.Objects;

public class Book {
    private int Id;
    private String name;
    private String writer;
    private String description;

    private Type type;
    private int lastMemberId;
    private double depository;
    private Availability availability;
    private int floor;
    private String section;
    private int shelf;

    public Book(int id, String name,String writer, String description, Type type,int lastMemberId,double depository, Availability availability) {
        Id = id;
        this.name = name;
        this.writer=writer;
        this.description = description;
        this.type = type;
        this.lastMemberId = lastMemberId;
        this.depository = depository;
        this.availability = availability;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }
public String getWriter(){
        return writer;
}
    public String getDescription() {
        return description;
    }

    public Type getType() {
        return type;
    }

    public int getLastUserId() {
        return lastMemberId;
    }

    public double getDepository() {
        return depository;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public void setLastMemberId(int lastMemberId) {
        this.lastMemberId = lastMemberId;
    }

    public void setDepository(double depository) {
        this.depository = depository;
    }

    public double calculateDamage(Damage damage){
        if(damage==Damage.NONE){this.depository=depository;}
        else if(damage==Damage.HIGH){this.depository=depository*0.25;}
        else if(damage==Damage.MEDIUM){this.depository=depository*0.50;}
        else if(damage==Damage.LOW){this.depository=depository*0.75;}
        else if(damage==Damage.LOST){this.depository=0;setAvailability(Availability.LOST);}
        return depository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Id == book.Id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();

        builder.append("Id: "+Id+ "\n");
        builder.append("Name: "+name+ "\n");
        builder.append("Writer: "+writer+ "\n");
        builder.append("Description: "+description+ "\n");
        builder.append("Type: "+type+ "\n");
        builder.append("LastMemberId: "+lastMemberId+ "\n");
        builder.append("Depository: "+depository+ "\n");
        builder.append("Status: "+availability+"\n");
        String lowercase = getName().toLowerCase();
        char c = lowercase.charAt(0);
        if(availability==Availability.AVAILABLE) {

            if (c >= '0' && c < '3' || c >= 'a' && c < 'i') {
                builder.append("Floor: 0 " + "\n" + "Section: A " + "\n" + "Shelf: 0 ");
            } else if (c >= '3' && c < '6' || c >= 'i' && c < 'o') {
                builder.append("Floor: 1 " + "\n" + "Section: B " + "\n" + "Shelf: 1 ");
            } else if (c >= '6' && c <= '9' || c >= 'o' && c <= 'z') {
                builder.append("Floor: 2 " + "\n" + "Section: C " + "\n" + "Shelf: 2 ");
            }
        }
        return builder.toString();

    }
}
