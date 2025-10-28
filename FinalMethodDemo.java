class FinalMethodDemo1 {
    void display() {
        System.out.println("Method of parent class");
    }
}

class FinalMethodDemo extends FinalMethodDemo1 {
    void display() {
        System.out.println("Method of child class");
        super.display(); // calling parent version
    }

    public static void main(String[] args) {
        FinalMethodDemo d1 = new FinalMethodDemo();
        d1.display();
    }
}
