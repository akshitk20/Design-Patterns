package oop.exercise;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Author author = new Author("Tim Grover");
        Book book = new Book("Relentless", author);

        // clone
        Book clone = (Book) book.clone(); // shallow copy

        System.out.println("Original book and author " + book.title + book.author.name);
        System.out.println("Clone book and author " + clone.title + clone.author.name);

        book.title = "Rick and Morty";
        System.out.println("Original book and author " + book.title + book.author.name);
        System.out.println("Clone book and author " + clone.title + clone.author.name);

    }
}
