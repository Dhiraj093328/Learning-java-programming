class OverLoadDemo2{

	void show(int id)
	{
		System.out.println("Welcome To Overloading ");
	}

	void display(String id)
	{
		System.out.println("Welcome To Overloading  ");
	}

	public static void main(String args[])
	{
		OverLoadDemo2 d1 = new OverLoadDemo2();
		d1.display(10);
		d1.display("Ram");
	}

}