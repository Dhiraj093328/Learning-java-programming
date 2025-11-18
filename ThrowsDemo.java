import java.io.*;
class ThrowsDemo
{
	void display() throws IOException
	{
		System.out.println("Throws Example");
	}
}

class ThrowTest
{
	public static void main(String args[])
	{
		ThrowDemo d1=new ThrowDemo();
		try{
			d1.display();
		}catch(Exception e);
	}
}