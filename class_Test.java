// Class to demonstrate 'this' keyword in method calling
class ConMethod {

    void display(int b) {
        System.out.println("Hello from display: " + b);
    }

    void show(int a) {
        System.out.println("Hello from show: " + a);
        this.display(a); // same as just display(a), but 'this' clarifies it's from the current object
    }
}

// Main class to test the ConMethod class
class_Test {
    public static void main(String args[]) {

        ConMethod m1 = new ConMethod();
        m1.show(10);

        ConMethod m2 = new ConMethod();
        m2.show(20);
    }
}
