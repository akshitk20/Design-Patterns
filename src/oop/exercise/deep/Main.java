package oop.exercise.deep;

import oop.exercise.deep.Author;
import oop.exercise.deep.Book;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
       Author author = new Author("Tim Grover");
       Book book = new Book("Relentless", author);

       //deep copy
        Book clone = (Book) book.clone();

        System.out.println(book.author.name+" "+book.name);
        System.out.println(clone.author.name+" "+clone.name);

        clone.name = "Rick and Morty";
        System.out.println(book.author.name+" "+book.name);
        System.out.println(clone.author.name+" "+clone.name);

    }
}
