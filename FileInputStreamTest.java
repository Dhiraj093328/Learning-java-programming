import java.io.FileInputStream;

public class FileInputStreamTest
{
    public static void main(String args[])
    {
        try {
            FileInputStream fs = new FileInputStream("C:\\Users\\91742\\Desktop\\github_projects\\Learning-java-programming\\files data\\test.txt");
            
            int i;
	while ((i = fs.read()) != -1)
            {
                System.out.println((char)i);
            }
            
            fs.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
