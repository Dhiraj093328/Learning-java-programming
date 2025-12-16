import java.util.*;
class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList l1=new ArrayList();

		l1.add(10);
		l1.add(34);
		l1.add(67);
		l1.add(20);

		System.out.println("origina lList"+l1);

		Collections.sort(l1);

		System.out.println("Sorted List :"+l1);


		ArrayList l2=new ArrayList();

		l2.add("Nilesh");
		l2.add("Sandip");
		l2.add("Ganesh");
		l2.add("Santosh");

		System.out.println("origina lList"+l2);

		Collections.sort(l2);

		System.out.println("Sorted List :"+l2);

		l2.remove("Sandip");

		System.out.println(l2);

		l1.addAll(l2);

		System.out.println("After AddAll: "+l1);

		l1.removeAll(l2);

		System.out.println("After Remove All l2 elements: "+l1);

		System.out.println("\n");


		ArrayList l3=new ArrayList();

		l3.add(10);
		l3.add(56);
		l3.add(72);
		l3.add(77);

		System.out.println("Index of 72 in l3 :"+l3.indexOf(72));

		System.out.println("78 is Available in l3 :"+l3.contains(78));
		System.out.println("72 is Available in l3 :"+l3.contains(72));


		l3.clear();
		System.out.println("L3 :"+l3);






	}
}