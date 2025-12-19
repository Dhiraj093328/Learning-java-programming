import java.util.*;

class TreeSetDemo
{
    public static void main(String args[])
    {
        TreeSet<Integer> t1 = new TreeSet<>();

        t1.add(27);
        t1.add(26);
        t1.add(21);
        t1.add(16);
        t1.add(19);
        t1.add(18);
        t1.add(17);

        System.out.println("\nTreeSet : " + t1);

        t1.pollFirst();
        t1.pollLast();
        System.out.println("\nTreeSet after poll : " + t1);

        System.out.println("\nDescending TreeSet : " + t1.descendingSet());

        System.out.println("\nTreeSet HeadSet : " + t1.headSet(19, true));

        System.out.println("\nTreeSet TailSet : " + t1.tailSet(19, false));

        System.out.println("\nSubSet : " + t1.subSet(18, true, 26, true));

        System.out.println("\nHigher than 19 : " + t1.higher(19));

        System.out.println("\nLower than 19 : " + t1.lower(19));

        System.out.println("\nCeiling of 19 : " + t1.ceiling(19));

        System.out.println("\nFloor of 19 : " + t1.floor(19));

        System.out.println("\n");
        System.out.println("For Floating values\n");

        TreeSet<Double> t2 = new TreeSet<>();

        t2.add(19.18);
        t2.add(13.4);
        t2.add(21.5);
        t2.add(18.38);
        t2.add(19.25);
        t2.add(25.32);
        t2.add(17.86);

        System.out.println("TreeSet : " + t2);

        System.out.println("\nCeiling of 19.20 : " + t2.ceiling(19.20));

        System.out.println("\nFloor of 19.20 : " + t2.floor(19.20));
    }
}
