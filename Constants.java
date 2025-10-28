final class Constants
{
	static final double pi=3.14;
	
}
class Circle
{
	int radius;

	public void area(int radius)
	{
		double result=Constants.pi*radius*radius;

		System.out.println("Area of circle: " + result);

	}

	public static void main(String args[])
	{
		Circle c1=new Circle();
		c1.area(5);
	}
}
