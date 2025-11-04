class ForEachLoop
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50,60,70};

		System.out.println("Output Using normal loop \n");


		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("\n");

 

		System.out.println("Output Using for-each loop \n");
		for(int j:a)
		{
			System.out.println(j);
		}

	}
}

