import java.io.FileReader;

class classNotFoundDemo {
    public static void main(String args[]) {
        try {
		class.forName("com.sam.ram");
        } catch (Exception e) {
            System.out.println("e");
        }
    }
}
