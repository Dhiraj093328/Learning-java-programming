import java.util.*;

class QueueDemo
{
	public static void main(String args[])
	{
		PriorityQueue pq=new PriorityQueue();

		pq.add("Apple");
		pq.add("Mango");
		pq.add("Banana");
		pq.add("Grapes");
		pq.add("Guva");

		//new Method add the data in queue
		pq.offer("orange");

		System.out.println(pq);

		System.out.println("\n");

		//peek() method
		System.out.println("Head of queue  : "+pq.peek());

		//Element() Method
		System.out.println("Head of queue  : "+pq.element());

		System.out.println("\n");

		//remove data from queue Methods

		pq.poll();

		System.out.println("After removing element queue");
		System.out.println(pq);

		System.out.println("\n");

		pq.remove();
		System.out.println("After removing element queue");
		System.out.println(pq);




	}
}
