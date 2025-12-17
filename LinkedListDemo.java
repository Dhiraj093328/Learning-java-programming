import java.util.*;

class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList l1 = new LinkedList();
		l1.add("Kalpesh");
		l1.add("Anup");
		l1.add("Dhiraj");
		l1.add("Akash");
		l1.add("yash");
		l1.add("Prakash");
		l1.addFirst("Pratik");
		l1.addLast("Praful");
		l1.push("vinit");


		System.out.println("Linked List :"+l1);
		System.out.println("Element at index 5 :"+l1.get(5));
		System.out.println("First Element :"+l1.getFirst());
		System.out.println("Last Element :"+l1.getLast());
		System.out.println("Last Element :"+l1.peekLast());
		System.out.println("Linked List :"+l1.peek());
		System.out.println("First Element :"+l1.peekFirst());






	}
}