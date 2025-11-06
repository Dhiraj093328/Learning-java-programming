//print the array and  array in reverse order

class ReverseArr
{
    public static void main(String[] args)
	{
		int[] arr = {12, 13, 35, 37,2,20};

        // Print array in original order
        	System.out.println("Array in original order:");
        	for (int i = 0; i < arr.length; i++)
		{
            		System.out.print(arr[i] + " ");
       		}

        	System.out.println(); // Move to next line

        	// Print array in reverse order
        	System.out.println("Array in reverse order:");
        	for (int i = arr.length - 1; i >= 0; i--)
		{
           		 System.out.print(arr[i] + " ");
       		 }

    }
}
