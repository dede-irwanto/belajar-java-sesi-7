import java.util.Hashtable;
import java.util.Map;

public class HasTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("Dede", "Dede");
        map.put("Budi", "Budi");
        map.put("Joko", "Joko");

        for (var key : map.keySet()) {
            System.out.println(key);
        }
    }
}
