import java.util.*;

class ScannerTestDemo2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner("Hello world i am Dhiraj");

		while(sc.hasNextLine())
		{
			System.out.print(sc.nextLine());
		}
		
		
	}
}