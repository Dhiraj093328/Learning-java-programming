import java.io.FileReader;
//import java.io.FileNotFoundException;

class FileNotFoundDemo {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("missing.txt");
        } catch (Exception e) {
            System.out.println("e");
        }
    }
}
