class ThreadGetPriority extends Thread
{
    public void run()
    {

	System.out.println(Thread.currentThread().getName());

   }

    public static void main(String args[])
    {
        ThreadGetPriority t1 = new ThreadGetPriority();
	ThreadGetPriority t2 = new ThreadGetPriority();
        ThreadGetPriority t3 = new ThreadGetPriority();

	System.out.println(t1.getPriority());
	System.out.println(t2.getPriority());
	System.out.println(t3.getPriority());

	t2.setPriority(8);
	t1.setPriority(3);
	t3.setPriority(9);

	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getPriority());

	Thread.currentThread().setPriority(10);

	System.out.println(Thread.currentThread().getName());





    }
}
