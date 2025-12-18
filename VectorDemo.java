import java.util.*;

class VectorDemo
{
	public static void main(String args[])
	{
		Vector v1 = new Vector();
		v1.add("innova");
		v1.add("qualis");
		v1.add("Ettios");
		v1.add("Camry");
		v1.add("Velfire");
		v1.add("Cruiser");
		v1.addElement("innova crysta");
		v1.removeElementAt(4);

		System.out.println("\n");


		System.out.println(v1);

		System.out.println("\n");

		System.out.println("Element at index 4 :"+v1.elementAt(4));
		System.out.println("First Element :"+v1.firstElement());
		System.out.println("Last Element :"+v1.lastElement());
		System.out.println("Adress of all Element :"+v1.elements());
		System.out.println("Adress of all Element :"+v1.elements());
		System.out.println("Contains innova :"+v1.contains("innova"));
		System.out.println("Contains Legender:"+v1.contains("Legender"));
		System.out.println("Index of Curiser : " + v1.indexOf("Cruiser"));
		System.out.println("Size of vector : " + v1.size());
		System.out.println("Cloned vector List : " + v1.clone());
		System.out.println("vector elements using toArray():"+v1.toArray());


	}
}