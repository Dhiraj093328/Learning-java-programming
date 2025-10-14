class Employee{

	int salary=40000;
	String compony_name="FCTP";
}

class Programmer extends Employee{

	int bonus=10000;
	String name="Shyam";
	String Skill="Java";
}

class JProgrammer extends Employee{

	int bonus=50000;
	String name="Gokul";
}


class TestInheritance_1
{
	public static void main(String args[])
	{
		JProgrammer p=new JProgrammer();
		System.out.println("Name:"+p.name+" Salary :  "+p.salary+" Bouns: "+p.bonus+" Compony : "+p.compony_name+ Skill : "+p.skill );
	}

}