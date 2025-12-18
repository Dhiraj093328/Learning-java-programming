import java.util.*;

class ArrayDequeDemo
{
	public static void main(String args[])
	{
		ArrayDeque adq=new ArrayDeque();

		adq.add("Ram");
		adq.add("Pravin");
		adq.add("Shreyash");
		adq.add("Kaushal");
		adq.add("Sandesh");

		//new Method add the data in queue
		adq.offer("Vishal");
		System.out.println("ArrayDeque : "+adq);

		System.out.println("\n");

		//add the data in queue first
		adq.offerFirst("Sachin");
		System.out.println("ArrayDeque After add new element First :\n\n "+adq);

		System.out.println("\n");

		//add the data in queue Last
		adq.offerLast("Omkar");
		System.out.println("ArrayDeque After add new element Last :\n\n "+adq);

		System.out.println("\n");

		//remove the data in queue
		adq.remove();
		System.out.println("ArrayDeque After remove element :\n\n "+adq);

		System.out.println("\n");

		//remove/poll the data in queue
		adq.poll();
		System.out.println("ArrayDeque After poll element :\n\n "+adq);

		System.out.println("\n");

		//remove/poll the data in queue Last
		adq.pollLast();
		System.out.println("ArrayDeque After poll element Last :\n\n "+adq);


	}
}
