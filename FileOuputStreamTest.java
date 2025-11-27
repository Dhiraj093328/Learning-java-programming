import java.io.FileOutputStream;

public class FileOuputStreamTest
{
    public static void main(String args[])
    {
        try {
            FileOutputStream fs = new FileOutputStream("C:\\Users\\91742\\Desktop\\github_projects\\Learning-java-programming\\files data\\test.txt");
            fs.write(65);
	 	String s="Welcome IO Programing";
		byte b[]=s.getBytes();
            fs.write(b);

            fs.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
