import java.io.*;

class DataOutputStreamDemo {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\91742\\Desktop\\github_projects\\Learning-java-programming\\files data\\test.txt");

            DataOutputStream dout = new DataOutputStream(fout);

            dout.writeInt(62);
            dout.flush();
            dout.close();

        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("File write successfully");

    }
}
