class Poly2Demo
{
	void display()
	{
		System.out.println("Method without arg")
	}
	void display(int id)
	{
		System.out.println("Method with arg"+id")
	}
	public static void main(String args[])
	{
		Poly2Demo d1=new Poly2Demo();
		d1.display();
		d1.display(10);
	}
}