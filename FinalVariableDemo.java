class FinalVariableDemo
{
	final int no=50;
	void display()
	{
		System.out.println("value of no: "+no);

		//no=100;

		//System.out.println("value of no: "+no);

	}
	public static void main(String args[])
	{
		FinalVariableDemo d1= new FinalVariableDemo();
		d1.display();
	}
}

// in above program alredy declare final keyword then value of variable cannot be changed