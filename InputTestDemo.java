import java.util.*;
class InputTestDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entetr a name: ");
		String name=sc.nextLine();

		System.out.println("Entetr a age: ");
		int age=sc.nextInt();

		System.out.println("Entetr a salary: ");
		double salary=sc.nextDouble();

		System.out.println("Your name is : " +name);
		System.out.println("Your age is : " +age);
		System.out.println("Your salary is : " +salary);


		sc.close();
		
	}
}