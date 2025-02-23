package oop.exercise.deep;

public class Author {
    String name;

    public Author(String name) {
        this.name = name;
    }

    public Author(Author other) {
        this.name = other.name;
    }
}
