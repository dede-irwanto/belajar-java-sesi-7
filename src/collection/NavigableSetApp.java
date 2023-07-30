package collection;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Dede", "Irwanto", "Programmer", "Zaman", "Now"));

        NavigableSet<String> nameReverse = names.descendingSet();
        NavigableSet<String> irwanto = names.tailSet("Programmer", true);

        for (var name : irwanto) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // immutable.add("Ups"); // error

    }
}
