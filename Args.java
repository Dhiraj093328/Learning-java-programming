class Args
{
	public static void main(String args[])
	{
		int a[]=new int[5];

		System.out.println(" My comman line array data\n");
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(int j:a)
		{
			System.out.println(j);
		}

	}
}

