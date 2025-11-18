class Outer1
{

	int a=50;

	public void display()
	{
		System.out.println("value :"+a);

		class LocalInner
		{

			void show()
			{
				System.out.println("Method of Inner class");
			}
		}

		LocalInner l1=new LocalInner();
		l1.show();
	}

	


	public static void main(String args[])
	{
		Outer1 o1=new Outer1();

		o1.display();
	}


}