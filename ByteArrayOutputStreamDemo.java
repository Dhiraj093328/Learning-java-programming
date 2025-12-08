import java.io.*;

class ByteArrayOutputStreamDemo {
    public static void main(String args[]) {
        try {
            FileOutputStream bout1 = new FileOutputStream("C:\\Users\\91742\\Desktop\\github_projects\\Learning-java-programming\\files data\\test (1).txt");
            FileOutputStream bout2 = new FileOutputStream("C:\\Users\\91742\\Desktop\\github_projects\\Learning-java-programming\\files data\\test (2).txt");
            FileOutputStream bout3 = new FileOutputStream("C:\\Users\\91742\\Desktop\\github_projects\\Learning-java-programming\\files data\\test (3).txt");

            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            bout.write(65);   // Writes 'A'

            // write to files
            bout.writeTo(bout1);
            bout.writeTo(bout2);
            bout.writeTo(bout3);

            bout.flush();
            bout.close();


        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\nSuccessful....write");
    }
}
