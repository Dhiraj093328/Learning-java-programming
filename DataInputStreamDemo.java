import java.io.*;

class DataInputStreamDemo {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\91742\\Desktop\\github_projects\\Learning-java-programming\\files data\\test.txt");
            DataInputStream din = new DataInputStream(fin);

		int count=fin.available();

		byte[] arr=new byte[count];

		din.read(arr);

		for(byte bt:arr)
		{
			char k=(char)bt;

           		 System.out.print(k+" ");

		}

            
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
