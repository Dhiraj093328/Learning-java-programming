import java.util.*;

enum Colors { GREEN, SAFFRON, BLUE, RED, YELLOW }

public class EnumMapSetTest {
    public static void main(String args[]) {

        EnumMap<Colors, String> map = new EnumMap<>(Colors.class);

        map.put(Colors.GREEN, "1");
        map.put(Colors.SAFFRON, "2");
        map.put(Colors.BLUE, "3");

        System.out.println(map);
    }
}
