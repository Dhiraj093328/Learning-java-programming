class StaticInnerDemo {
    static int data = 100;

    static void display() {
        System.out.println("calling from static method of outer class");
    }

    // static inner class
    static class Inner {
        void show() {
            // can access static members of outer class
            System.out.println(data);
            display();
        }
    }

    public static void main(String[] args) {
        StaticInnerDemo.Inner d1 = new StaticInnerDemo.Inner();
        d1.show();
    }
}
