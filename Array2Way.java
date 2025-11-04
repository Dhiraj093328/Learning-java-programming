class Array2Way
{
	public static void main(String args[])
	{
		int a[]=new int [5];


		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;

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

