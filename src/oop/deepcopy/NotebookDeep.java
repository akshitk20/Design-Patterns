package oop.deepcopy;

import java.util.ArrayList;

public class NotebookDeep {
    ArrayList<String> pages;

    // Constructor
    public NotebookDeep() {
        this.pages = new ArrayList<>();
    }

    public NotebookDeep(NotebookDeep other) {
        this.pages = new ArrayList<>(other.pages);
    }

    void addPage(String page) {
        pages.add(page);
    }

    void display() {
        System.out.println(pages);
    }
}
