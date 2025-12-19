import java.util.*;

class TreeSetDemo2
{
	public static void main(String args[])
	{
		TreeSet t2 = new TreeSet();

		t2.add(5);
		t2.add(20);
		t2.add(30);
		t2.add(40);
		t2.add(50);

        	System.out.println("\n TreeSet :" + t2);

		// external values(values which not in Tree)

        	System.out.println("\n floor of 3 : " + t2.floor(3));
        	System.out.println("\n ceiling of 51 : " + t2.ceiling(51));

        	System.out.println("\n floor of 25 : " + t2.floor(25));

        	System.out.println("\n ceiling of 25 : " + t2.ceiling(25));


		//For internal Values 
        	System.out.println("\n higher of 20 : " + t2.higher(20));
        	System.out.println("\n lower of 20 : " + t2.lower(20));


	}
}

