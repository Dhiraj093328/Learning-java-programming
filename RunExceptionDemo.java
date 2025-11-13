import java.io.FileReader;

class RunExceptionDemo {
    public static void main(String args[]) {

	int a=10;
	int b=0;

	System.out.println("Welcome to exception handling");
        try {
	System.out.println("a/b");

        } catch (Exception e) {
            System.out.println("Rest of the code");
        }
    }
}
