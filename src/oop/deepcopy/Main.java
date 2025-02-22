package oop.deepcopy;

public class Main {
    public static void main(String[] args) {
        NotebookDeep original = new NotebookDeep();
        original.addPage("Page 1");
        original.addPage("Page 2");

        // Deep copy
        NotebookDeep deepCopy = new NotebookDeep(original);

        System.out.println("Before modification:");
        original.display();
        deepCopy.display();

        // Modify deep copy
        deepCopy.addPage("Page 3");

        System.out.println("\nAfter modification:");
        original.display();      // Not affected!
        deepCopy.display();
    }
}
