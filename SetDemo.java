import java.util.*;

class SetDemo {
    public static void main(String args[]) {

        // HashSet
        HashSet hs = new HashSet();

        hs.add("Monday");
        hs.add("Tuesday");
        hs.add("Wednesday");
        hs.add("Thursday");
        hs.add("Friday");
        hs.add("Saturday");
        hs.add("Sunday");
        hs.add(null);

        System.out.println("HashSet :\n\n" + hs);

        System.out.println("Make copy of collection : " + hs.clone());
        System.out.println("Sunday is part of collection : " + hs.contains("Sunday"));
        System.out.println("Goodday is part of collection : " + hs.contains("Goodday"));
        System.out.println("Collection is Empty : " + hs.isEmpty());
        System.out.println("Size of collection : " + hs.size());

        // remove specific element
        hs.remove("Sunday");

        // clear all data
        hs.clear();

        // LinkedHashSet
        LinkedHashSet hs1 = new LinkedHashSet();

        System.out.println("\n");

        hs1.add("Monday");
        hs1.add("Tuesday");
        hs1.add("Wednesday");
        hs1.add("Thursday");
        hs1.add("Friday");
        hs1.add("Saturday");
        hs1.add("Sunday");
        hs1.add(null);

        System.out.println("LinkedHashSet :\n\n " + hs1);

        System.out.println("Make copy of collection : " + hs1.clone());
        System.out.println("Sunday is part of collection : " + hs1.contains("Sunday"));
        System.out.println("Goodday is part of collection : " + hs1.contains("Goodday"));
        System.out.println("Collection is Empty : " + hs1.isEmpty());
        System.out.println("Size of collection : " + hs1.size());

        hs1.remove("Sunday");
        hs1.clear();

        // TreeSet
        TreeSet hs2 = new TreeSet<>();

        hs2.add("Monday");
        hs2.add("Tuesday");
        hs2.add("Wednesday");
        hs2.add("Thursday");
        hs2.add("Friday");
        hs2.add("Saturday");
        hs2.add("Sunday");
        // TreeSet does NOT allow null

        System.out.println("\nTreeSet (Sorted Order) : \n\n" + hs2);
    }
}
