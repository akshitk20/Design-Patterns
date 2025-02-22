package oop.shallowcopy;

public class Main {
    public static void main(String[] args) {
        Notebook original = new Notebook();
        original.addPage("Page 1");
        original.addPage("Page 2");

        // Shallow copy
        Notebook shallowCopy = new Notebook(original);

        System.out.println("Before modification:");
        original.display();
        shallowCopy.display();

        // Modify shallow copy
        shallowCopy.addPage("Page 3");

        System.out.println("\nAfter modification:");
        original.display();      // Affected as well!
        shallowCopy.display();
    }
}
