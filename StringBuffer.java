class StringBuffer
{
	public static void main(String args[])
	{
		java.lang.StringBuffer sb = new java.lang.StringBuffer(); // default capacity is 16

		System.out.println("Krishna");

		sb.append("Welcome everyone to fortune");

		System.out.println(sb);

		System.out.println(sb.capacity()); // prints 34, not 16
	}
}