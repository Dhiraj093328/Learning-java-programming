// Interface A
interface A {
    int id = 100;
}

// Interface B
interface B {
    String name = "Vrushabh";
}

// Class C implements A, B
class C implements A, B {
    String city = "Pune";

    void display() {
        System.out.println("Id: " + id + " Name: " + name + " City: " + city);
    }

    public static void main(String[] args) {
        C c1 = new C();
        c1.display();
    }
}
