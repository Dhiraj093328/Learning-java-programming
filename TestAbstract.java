abstract class Bike
{
	abstract void run();
	abstract void show();

	void display()
	{
		System.out.println("Non Abstract Method in Abstract class..");
	}


}

class Bajaj extends Bike{

	void run()
	{
		System.out.println("Bike is running..");
	}

	void show(){}
}

class TestAbstract
{
	public static void main(String args[])
	{
		Bike b1 = new Bajaj();
		Bajaj b2 = new Bajaj();

		b1.run();
		b2.run();
		b1.display();
		b1.show();
	}
}