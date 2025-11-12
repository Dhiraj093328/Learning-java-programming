class TestMutable
{
	public static void main(String args[])
	{
		String s1 = new String("Hello"); // immutable String
		s1.concat("Krishna");
		System.out.println(s1); // prints "Hello" - original unchanged
		
		StringBuilder sb = new StringBuilder("Hello"); // mutable string
		sb.append("Krishna");
		System.out.println(sb); // prints "HelloKrishna" - modified
	}
}