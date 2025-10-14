class Employee {
    int salary = 40000;
    String company_name = "FCTP";
}

class Programmer extends Employee {
    int bonus = 10000;
    String name = "Shyam";
    String skill = "Java";
}

class JProgrammer extends Employee {
    int bonus = 50000;
    String name = "Gokul";
}

public class TestInheritance1 {
    public static void main(String[] args) {
        JProgrammer p = new JProgrammer();
        System.out.println("Name: " + p.name + " Salary: " + p.salary +" Bonus: " + p.bonus + " Company: " + p.company_name+ "  Skill: " + p.skill);
    }
}
