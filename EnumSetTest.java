import java.util.*;

enum Days { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
enum Colors { GREEN, SAFFRON, BLUE, RED, YELLOW }
enum City { PUNE, MUMBAI, BANGLORE, HYDERABAD, KOLKATA }

public class EnumSetTest {
    public static void main(String args[]) {

        // Create a List of City
        List<City> l1 = Arrays.asList(City.PUNE, City.MUMBAI);

        Set<Colors> s1 = EnumSet.allOf(Colors.class);
        Set<Days> s2 = EnumSet.of(Days.MONDAY, Days.FRIDAY, Days.SUNDAY);
        Set<Colors> s3 = EnumSet.noneOf(Colors.class);
        Set<City> s4 = EnumSet.copyOf(l1);

        System.out.println("Name of colors: " + s1);
        System.out.println("Name of Days: " + s2);
        System.out.println("Empty colors set: " + s3);
        System.out.println("Cities: " + s4);
    }
}
