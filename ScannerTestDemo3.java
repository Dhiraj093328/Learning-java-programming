import java.util.*;

class ScannerTestDemo3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner("My age is 22 years");

		while(sc.hasNext())
		{

			if(sc.hasNextInt())
				System.out.println(sc.next());
			else
				sc.next();
		}
		
		
	}
}