import java.io.File;
import java.io.IOException;

class FileDeleteDemo {
    public static void main(String args[]) {
        try {
            File f1 = new File("C:\\Users\\91742\\Desktop\\github_projects\\Learning-java-programming\\files data\\sample.txt");

            if (f1.delete()) {
                System.out.println("File " + f1.getName() + " is deleted successfully");
            } else {
                System.out.println("error occurred during deletion");
            }

           // System.out.println("Path of file: " + f1.getAbsolutePath());
           // System.out.println("So we have permission to read: " + f1.canRead());
           // System.out.println("So we have permission to write: " + f1.canWrite());
           // System.out.println("Length of file: " + f1.length());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
