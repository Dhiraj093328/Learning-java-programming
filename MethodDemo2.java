class MethodDemo2 {

    public void display() {
        System.out.println("This is my user-defined normal method");
    }

    static void goOut() {
        System.out.println("User-defined static method");
    }

    public static void main(String[] args) {
        MethodDemo2 m1 = new MethodDemo2();
        m1.display();      // Calling instance method
        goOut();           // Calling static method correctly
    }
}
