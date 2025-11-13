class StringTokenizer
{
	public static void main(String args[])
	{
		String s1="Have a nice day deae all";

		StringTokenizer st=new StringTokenizer(s1);

		while(st.hasoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}