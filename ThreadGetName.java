class ThreadGetName extends Thread
{
    public void run()
    {

	System.out.println(Thread.currentThread().getName());

   }

    public static void main(String args[])
    {
        ThreadGetName t1 = new ThreadGetName();
	ThreadGetName t2 = new ThreadGetName();
        ThreadGetName t3 = new ThreadGetName();

        t1.start();
        t2.start();
        t3.start();


	t1.setName("Dhiraj");
 


    }
}
