package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Dede");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Dede");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "Dede",
                "middle","Irwanto",
                "last","Ganteng"
        );
        // map.put("a", "A"); // error


    }
}
