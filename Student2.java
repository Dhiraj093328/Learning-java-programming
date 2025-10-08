// Using 'this' keyword
class Student2 {

    int id;
    String name;
    double marks;

    // Constructor using 'this' to refer to instance variables
    public Student2(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student data
    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " Marks: " + marks);
    }

    public static void main(String[] args) {
        Student2 d1 = new Student2(101, "Akash", 80.27);
        d1.display();

        Student2 d2 = new Student2(102, "Anup", 60.27);
        d2.display();
    }
}
