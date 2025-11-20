class ThreadDemo5 extends Thread
{
    public void run()
    {
        System.out.println("Thread is executed");
    }

    public static void main(String args[])
    {
        ThreadDemo5 t1 = new ThreadDemo5(); // Create object properly
        t1.run(); // Start the thread
    }
}
