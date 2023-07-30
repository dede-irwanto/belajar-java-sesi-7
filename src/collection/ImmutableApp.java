package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Dede");
        mutable.add("Irwanto");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> element = List.of("Dede", "Irwanto");
        element.add("Eka");
    }
}
