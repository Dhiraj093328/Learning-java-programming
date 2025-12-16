import java.util.*;

class PersonInfo {
    int id;
    String name;
    int age;
    String city;

    PersonInfo(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }
}

class TestPersonList {
    public static void main(String args[]) {

        PersonInfo p1 = new PersonInfo(101, "Samarth", 28, "Nagpur");
        PersonInfo p2 = new PersonInfo(102, "Aditya", 22, "Akola");
        PersonInfo p3 = new PersonInfo(103, "Siddhi", 22, "Kudal");
        PersonInfo p4 = new PersonInfo(104, "Samarth", 37, "Bhuswal");

        ArrayList<PersonInfo> l1 = new ArrayList<PersonInfo>();
        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        l1.add(p4);

        Iterator<PersonInfo> itr = l1.iterator();

        while (itr.hasNext()) {
            PersonInfo p = itr.next();
            System.out.println(p.id + " " + p.name + " " + p.age + " " + p.city);
        }
    }
}
