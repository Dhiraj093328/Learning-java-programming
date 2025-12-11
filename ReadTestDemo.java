import java.io.*;

class ReadTestDemo {
    public static void main(String[] args) {
        try {
            File f1 = new File("C:\\Users\\91742\\Desktop\\github_projects\\Learning-java-programming\\files data\\sample.txt");

            if (f1.createNewFile()) {
                System.out.println(f1.getName() + " File created successfully");
            } else {
                System.out.println(f1.getName() + " File already exists");
            }

            System.out.println("Is file readable: " + f1.canRead());
            //System.out.println("Is file writeable: " + f1.canWrite());
            //System.out.println("Is file executable: " + f1.canExecute());

            // Modify permissions
            f1.setReadable(false);
            //f1.setWritable(false);
            //f1.setExecutable(false);

            System.out.println("\nAfter changing permissions: ");
            System.out.println("Is file readable: " + f1.canRead());
            //System.out.println("Is file writeable: " + f1.canWrite());
            //System.out.println("Is file executable: " + f1.canExecute());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
