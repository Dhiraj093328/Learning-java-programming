import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestThreadPool
{
    public static void main(String args[])
	{
        	ExecutorService executor = Executors.newFixedThreadPool(5);

        	for (int i = 0; i < 20; i++)
		{
            		Runnable worker = new WorkerThread("" + i);
            		executor.execute(worker);  // correct method call
       		 }

        executor.shutdown();  // stop accepting new tasks

        while (!executor.isTerminated()){}
	
            // wait for all tasks to finish
        

        System.out.println("All threads finished");
    }
}
