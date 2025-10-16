class PolyDemo{

	void display()
	{
		System.out.println("Display Method get executed");
	}

	void display(int a)
	{
		System.out.println("Display Method get executed " + a);
	}

	void display(String n)
	{
		System.out.println("Display Method get executed " + n);
	}

	public static void main(String args[])
	{
		PolyDemo P1 = new PolyDemo();
		P1.display();
		P1.display(10);
		P1.display("Ram");
	}

}