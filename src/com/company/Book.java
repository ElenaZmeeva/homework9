package com.company;

import java.util.Objects;

public class Book {
    private final String bookName;
   private final int pageAmount;
    private int publishingYear;


    public Book(String bookName, int pageAmount, int publishingYear) {
        this.bookName = bookName;
        this.pageAmount = pageAmount;
        this.publishingYear = publishingYear;
    }
    public String getName(){
        return bookName;
    }
public int getPageAmount(){
        return pageAmount;
}

public int getPublishingYear(){
        return publishingYear;
}
public void setPublishingYear (int publishingYear){
    this.publishingYear=publishingYear;
}
public String toString (){
        return "Name - " + this.bookName +", " +" Page - " + this.pageAmount +", " + "Year - "+ this.publishingYear;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageAmount == book.pageAmount && publishingYear == book.publishingYear && bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, pageAmount, publishingYear);
    }
}
