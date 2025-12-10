import java.util.*;

class ScannerTestDemo1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner("Hello world ");
		
		while(sc.hasNext())
		{
			System.out.print(sc.next());
		}
		
	}
}