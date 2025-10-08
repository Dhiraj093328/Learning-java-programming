class Student {

    int id;
    String name;
    double marks;

    public Student() {
        // Constructor can initialize values if needed
    }

    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " Marks: " + marks);
    }

    public static void main(String[] args) {
        Student d1 = new Student();
        d1.display();
    }
}
