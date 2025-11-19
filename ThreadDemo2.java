class ThreadDemo2 implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running.....");
	}

	public static void main(String args[])
	{
		Runnable r=new ThreadDemo();
		Thread t2=new Thread(r,"My Thread1");

		t2.start();
		String s1=t2.getName();

		System.out.println(s1);		
	}

}