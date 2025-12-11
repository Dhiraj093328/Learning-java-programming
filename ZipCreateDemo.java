import java.io.*;
import java.util.zip.*;

class ZipCreateDemo
{
	public static void main(String args[])
	{

		String sourceFile="C:\\Users\\91742\\Desktop\\github_projects\\Learning-java-programming\\files data\\sample.txt";
		String zipFile="C:\\Users\\91742\\Desktop\\github_projects\\Learning-java-programming\\files data\\output.zip";

		try{
			FileOutputStream fos=new FileOutputStream(zipFile);
			ZipOutputStream zos=new ZipOutputStream(fos);
			
			File fileToZip=new File(sourceFile);

			FileInputStream fis=new FileInputStream(fileToZip);

			ZipEntry zipentry=new ZipEntry(fileToZip.getName());

			zos.putNextEntry(zipentry);

			byte[] bytes=new byte[1024];

			int length;

			while((length= fis.read(bytes)) >= 0)
			{
				zos.write(bytes,0,length);
			}
			zos.close();
			fis.close();
			fos.close();

			System.out.println("\n Zip created successfully!");


		}catch(Exception e)
		{
			System.out.println(e);
		}

	}
}