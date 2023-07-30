package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Dede");

        Set<String> mutable = new HashSet<>();
        mutable.add("Dede");
        mutable.add("Irwanto");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Dede", "Irwanto");

        // set.add("Dede"); // error
        // set.remove("Dede"); // error
    }
}
