package com.company;

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
}
