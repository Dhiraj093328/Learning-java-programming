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
		v1.removeElements();


		System.out.println(v1);
		System.out.println("Element at index 4 :"+v1.elementAt(4));
		System.out.println("First Element :"+v1.firstElement());
		System.out.println("Last Element :"+v1.lastElement());
		System.out.println("Adress of all Element :"+v1.elements());
		//System.out.println(removeElement());
		//System.out.println(v1.removeelementAt(4));






	}
}