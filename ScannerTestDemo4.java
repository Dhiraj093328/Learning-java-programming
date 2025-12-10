import java.util.*;

class ScannerTestDemo4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner("My age is 22 years");

		Boolean hasNextToken=sc.hasNext();

		System.out.println("Does my string contains next tokens? :"+hasNextToken);		
		
	}
}