import java.io.*;

class BufferedInputStreamDemo {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\91742\\Desktop\\github_projects\\Learning-java-programming\\files data\\test.txt");

            BufferedInputStream bin = new BufferedInputStream(fin);

		int i;
		while((i=bin.read())!=-1)
		{
			System.out.print((char)i);
		}

            bin.close();
            fin.close();

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
