class ThreadJoinMethod extends Thread
{
    public void run()
    {

	System.out.println("Thread are executed");

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
