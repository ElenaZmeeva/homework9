package com.company;

import java.util.Objects;

public class Author {
    private final String author;

    public Author(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public String toString (){
        return "Author - " + this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author1 = (Author) o;
        return author.equals(author1.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author);
    }
}
