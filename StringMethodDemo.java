public class StringMethodDemo
{

	public static void main(String args[])
	{
		String s1="Hello";
		String s2="Ram";


	//Standard Method

		System.out.println(s1.concat(s2)); 


	//Using Operators

		String s3=s1+s2;

		System.out.println(s3);

		System.out.println("Length of my string : "+s3.length());

		System.out.println("Character At : "+s3.charAt(5));

		System.out.println("Substring : "+s3.substring(5,8));

		System.out.println("Substring : "+s3.substring(8));
//Starting index and return
// data till end of string

		System.out.println("equals : "+s1.equals(s2));

		System.out.println("Upper case : "+(s1+s2).toUpperCase());

		System.out.println("Lower case : "+(s1+s2).toLowerCase());







	}

}