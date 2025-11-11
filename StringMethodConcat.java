public class StringMethodConcat
{

	public static void main(String args[])
	{
		String s1="Hello";
		String s2="Ram";


	//Standard Method

		System.out.println("Using Standard Method : "+s1.concat(s2));

		System.out.print("\n"); 


	//Using Operators

		String s3=s1+s2;

		System.out.println("Using Operators Method : "+s3);

		}
}