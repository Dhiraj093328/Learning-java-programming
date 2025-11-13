import java.io.FileReader;

class InterruptedExceptionDemo {
    public static void main(String args[]) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
