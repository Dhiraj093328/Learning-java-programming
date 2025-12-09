import java.io.*;
class WriterDemo
{
	public static void main(String args[])
	{
		try{
			Writer w= new FileWriter("output.txt");
			String content="I like to leave pune";
			w.write(content);
			w.append("\nI like travel in india");
			w.close();


			System.out.println("write sucessfully");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}