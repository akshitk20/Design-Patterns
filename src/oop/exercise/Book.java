package oop.exercise;

public class Book implements Cloneable {
    String title;
    Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       return super.clone(); // shallow copy
    }
}
