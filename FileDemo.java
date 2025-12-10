import java.io.File;

import java.io.IOException;

class FileDemo
{
	public static void main(String args[])
	{
		try{
			File f1=new File("C:\\Users\\91742\\Desktop\\github_projects\\Learning-java-programming\\files data\\sample.txt");

			if(f1.createNewFile())
			{
				System.out.println("File "+f1.getName()+ "is created successfully");
			}
			else
			{
				System.out.println("File already exisist");
			}


		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}