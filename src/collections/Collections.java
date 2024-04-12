package collections;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Collections {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(Arrays.asList(args));
        System.out.println("using enumeration with vector");
        Enumeration<String> enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        System.out.println("using iterator with Vector");
        Iterator<String> iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("using for/in with array of Strings");
        for (String color : args) {
            System.out.println(color);
        }
    }
}
