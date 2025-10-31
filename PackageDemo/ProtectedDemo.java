package package1;

class ProtectedDemo {

    protected int id = 50; // 'protected' should be lowercase

    public static void main(String args[]) {
        ProtectedDemo d1 = new ProtectedDemo();
        System.out.println(d1.id);
    }
}
