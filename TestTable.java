class Table
{
    void printTable(int n)
    {
        // synchronized block for the first loop
        synchronized(this)
        { 
            for(int i = 1; i <= 5; i++)
            {
                System.out.println(n * i);

                try {
                    Thread.sleep(400);
                } catch(Exception e) {
                    System.out.println(e);
                }
            }
        }

        System.out.println("other calculation method");

        // second loop (not synchronized)
        for(int j = 0; j < 5; j++)
        {
            System.out.println(n * j);

            try {
                Thread.sleep(400);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread
{
    Table t;

    MyThread1(Table t)
    {
        this.t = t;
    }

    public void run()
    {
        t.printTable(100);
    }
}

class MyThread2 extends Thread
{
    Table t;

    MyThread2(Table t)
    {
        this.t = t;
    }

    public void run()
    {
        t.printTable(200);
    }
}

public class TestTable
{
    public static void main(String args[])
    {
        Table obj = new Table();

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}
