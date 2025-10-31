package package2;
import package1.ProtectedDemo;

class TestProtected extends ProtectedDemo{

    

    public static void main(String args[]) {
        ProtectedDemo d1 = new ProtectedDemo();
        System.out.println(d1.id);
    }
}
