class Vehicle  //parent class 
{
	public int run()
	{
		System.out.println("Hello from parent class Method");
		return 0;
	}
}

class Car extends Vehicle{  //child class

	public int run()
	{
		System.out.println("Hello from child class Method");
		return 1;
	}

	public static void main(String args[])
	{
		Car v1=new Car();
		v1.run();
		
	}
}
