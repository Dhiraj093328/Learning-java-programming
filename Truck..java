class Truck
{
	int speed;
	public Truck()
	{
		System.out.println("Speed of truck is: "+speed);

		System.out.println("Constructor );
	}

	{
		speed=50;

		System.out.println("Instance initializer block executed...");

	}
	public static void main(String args[])
	{
		truck t1=new Truck();
		truck t2=new Truck();
	}
}