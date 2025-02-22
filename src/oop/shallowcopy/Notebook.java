package oop.shallowcopy;

import java.util.ArrayList;

public class Notebook {
    ArrayList<String> pages;

    // Constructor
    public Notebook() {
        this.pages = new ArrayList<>();
    }

    // Shallow copy constructor
    public Notebook(Notebook other) {
        this.pages = other.pages;  // Copies reference (NOT the actual list)
    }

    void addPage(String page) {
        pages.add(page);
    }

    void display() {
        System.out.println(pages);
    }
}
