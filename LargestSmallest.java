// write a java program to find largest and smallest elements array

class LargestSmallest
{
	public static void main(String args[])
	{
		int max=a[0];
		int min=a[0];


		System.out.println(" My comman line array data\n");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}

		for(int j=0;j<a.length;j++)
		{
			if(a[j]<min)
			{
				min=a[i];
			}
			
		}

		System.out.println("Largest: "+max+ " smallest "+min);
		
	}
}

