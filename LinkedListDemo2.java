import java.util.*;

class LinkedListDemo2
{
	public static void main(String args[])
	{
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(18);
		l1.add(21);
		l1.add(25);
		l1.add(29);
		l1.add(23);
		System.out.println("\n");

		System.out.println("Linked List :"+l1);

		l1.poll();
		l1.pollFirst();
		l1.pollLast();

		//add new elements in :List
		l1.offerFirst(5);
		l1.offerLast(8);
	
		System.out.println("\n");


		System.out.println("Linked List after operation :"+l1);
		System.out.println("Contains 20:"+l1.contains(20));
		System.out.println("Contains 21:"+l1.contains(21));
		System.out.println("Index of 25 : " + l1.indexOf(25));
		System.out.println("Size of Linked List : " + l1.size());
		System.out.println("Cloned Linked List : " + l1.clone());
		System.out.println("Linked List elements using toArray():"+l1.toArray());




		


	}
}