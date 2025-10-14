class Employee {
    int salary = 40000;
    String company_name = "FCTP";
}

class Programmer extends Employee {
    int bonus = 10000;
    String name = "Shyam";
    String skill = "Java";
}

class Tester extends Employee {
    int bonus = 40000;
    String name = "Rajiv";
    String skill = "Seleniumid";
}

class JProgrammer extends Employee {
    int bonus = 50000;
    String name = "Gokul";
}

public class TestInheritance2 {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Name: " + p.name + " Salary: " + p.salary +" Bonus: " + p.bonus + " Company: " + p.company_name+ "  Skill: " + p.skill);

	Tester p1 = new Tester();
        System.out.println("Name: " + p1.name + " Salary: " + p1.salary +" Bonus: " + p1.bonus + " Company: " + p1.company_name+ "  Skill: " + p1.skill);
    }
}
