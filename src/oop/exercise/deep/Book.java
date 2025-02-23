package oop.exercise.deep;

public class Book implements Cloneable {
    String name;
    Author author;

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

   @Override
    protected Object clone() throws CloneNotSupportedException {
       Book copy = (Book) super.clone();
       copy.author = new Author(this.author); // deep copy
       return copy;
   }
}
