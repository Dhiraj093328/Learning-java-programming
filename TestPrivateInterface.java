interface MyInterface {

    default void show() {
        printDetails();
        System.out.println("Use to show message");
    }

    default void display() {
        printDetails();
        System.out.println("Use to display data");
    }

    default void printDetails() {
        System.out.println("Printing common details...");
    }
}

class PrivateInterface implements MyInterface {
    // no need to override anything
}

class TestPrivateInterface {
    public static void main(String[] args) {
        PrivateInterface p1 = new PrivateInterface();
        p1.display();
        p1.show();
    }
}
