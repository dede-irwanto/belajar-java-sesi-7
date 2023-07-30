package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Dede");
        collection.add("Irwanto");
        collection.addAll(List.of("Programmer", "Zaman", "Now"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE");

        collection.remove("Dede");
        collection.removeAll(List.of("Zaman", "Now"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("CONTAINS");

        System.out.println(collection.contains("Irwanto"));
        System.out.println(collection.containsAll(List.of("Irwanto", "Programmer")));

        System.out.println("SIZE");
        System.out.println(collection.size());


    }
}
