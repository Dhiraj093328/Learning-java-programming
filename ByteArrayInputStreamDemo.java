import java.io.*;

class ByteArrayInputStreamDemo {
    public static void main(String args[]) {
        try {
		byte[] buf={35,36,37};

            ByteArrayInputStream bout = new ByteArrayInputStream();
            int k=0;

		while((k=bout.read())!=-1)
		{
			char ch=(char)k;
        System.out.println("\nSuccessful....write");

		}


        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\nSuccessful....write");
    }
}
