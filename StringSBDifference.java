class StringSBDifference
{
	public static void main(String args[])
	{
		long startTime = System.currentTimeMillis();
		java.lang.StringBuffer sb = new java.lang.StringBuffer("java");
		for(int i = 0; i < 10000; i++)
		{
			sb.append("is easy");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + " ms");
		
		long startTime2 = System.currentTimeMillis();
		java.lang.StringBuilder sb1 = new java.lang.StringBuilder("java");
		for(int i = 0; i < 10000; i++)
		{
			sb1.append("is easy");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime2) + " ms");
	}
}