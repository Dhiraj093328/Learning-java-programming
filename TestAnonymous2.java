interface A {
    void run();
}

class TestAnonymous2 {

    public static void main(String args[]) {

        A a1 = new A() {
            public void run() {   // must be public
                System.out.println("interface class");
            }
        };

        a1.run();
    }
}
