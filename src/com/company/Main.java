package com.company;

public class Main {

    public static void main(String[] args) {
        Author book1 = new Author("Victor Hugo - ");
        System.out.print(book1.getAuthor());
        Book book = new Book("Les Miserables", 509, 2021);
        System.out.println(book.getName() +", " + book.getPageAmount() +", " + book.getPublishingYear());
        Author book2 = new Author("Jane Austen - ");
        System.out.print(book2.getAuthor());
        Book booK = new Book("Emma", 768, 2020);
        System.out.println(booK.getName() +", " + booK.getPageAmount() +", "+ booK.getPublishingYear());
        booK.setPublishingYear(2022);
        System.out.println(booK.getPublishingYear());
    }
}
