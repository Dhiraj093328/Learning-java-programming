class ThreadDemo6 extends Thread
{
    public void run()
    {
	for(int i=0;i<5;i++)
	{
		try{
			Thread.sleep(500);
		}catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println(i);

	}

    }

    public static void main(String args[])
    {
        ThreadDemo6 t1 = new ThreadDemo6();
	ThreadDemo6 t2 = new ThreadDemo6();
        ThreadDemo6 t3 = new ThreadDemo6();

        t1.start();


		try{
			t1.join();
		}catch(Exception e)
		{
			System.out.println(e);
		}


        t2.start();
        t3.start();

 


    }
}
