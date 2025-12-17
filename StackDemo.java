import java.util.*;

class StackDemo
{
	public static void main(String args[])
	{
		Stack st =new Stack();
		boolean res=st.empty();
		System.out.println("Is stack empty? :" +res);

		st.push(5);
		st.push(56);
		st.push(5);
		st.push(29);
		st.push(31);

		System.out.println("Elements of stack :"+st);

		System.out.println("Top of stack :"+st.peek());

		System.out.println("\n");

		System.out.println("search method using Index of 56 :"+st.search(56));
		System.out.println("search method using Index of 77 :"+st.search(77));




		st.pop();
		st.pop();
		st.pop();

		System.out.println("\n");

		System.out.println("Elements of stack after pop:"+st);
		System.out.println("Top of stack :"+st.peek());




	}
}