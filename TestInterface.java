interface Shape {
    void draw();
    void display();

    // Default method in interface
    default void run() {
        System.out.println("Executing default method");
    }
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void display() {
        System.out.println("Show Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing Square");
    }

    public void display() {
        System.out.println("Show Square");
    }
}

class TestInterface {
    public static void main(String args[]) {
        Shape s = new Circle();
        s.draw();
        s.display();
        s.run(); // calling the default method

        Shape s1 = new Square();
        s1.draw();
        s1.display();
        
    }
}

// Note:
// - All abstract methods in an interface *must* be implemented in classes.
// - Default methods let you add new functionality to interfaces 
//   without breaking existing implementations.
