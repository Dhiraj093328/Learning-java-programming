class ArrayOperations
{
    public static void main(String args[])
	{
        	try {
            	int[] arr = {56, 8, 9, 18, 30};

            	System.out.println("Array elements:");
            	for (int i = 0; i < arr.length; i++)
		{
                	System.out.print(arr[i] + " ");
            }
            System.out.println();

            int max = arr[0];
            int pos = 0;
            for (int i = 1; i < arr.length; i++)
		{
                if (arr[i] > max)
		{
                    max = arr[i];
                    pos = i;
                }
            }
            System.out.println("Largest element: " + max);
            System.out.println("Position of largest element: " + (pos + 1));

            int sum = 0;
            for (int i = 0; i < arr.length; i++)
		{
                	sum += arr[i];
            	}
            		System.out.println("Sum of elements: " + sum);

        } catch (Exception e)
		{
            		System.out.println("Error occurred: " + e);
        	}
    }
}
