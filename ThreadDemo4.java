class ThreadDemo4 extends Thread
{
    public void run()
    {
        System.out.println("Thread is executed");
    }

    public static void main(String args[])
    {
        ThreadDemo4 t1 = new ThreadDemo4(); // Create object properly
        t1.start(); // Start the thread
    }
}
