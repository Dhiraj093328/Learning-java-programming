class StudentDemo {
    int rollno;
    String name, course;
    float fee;

    // Constructor 1: rollno, name, course
    StudentDemo(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    // Constructor 2: rollno, name, course, fee
    StudentDemo(int rollno, String name, String course, float fee) {
        this(rollno, name, course); // constructor chaining
        this.fee = fee;
    }

    // Method to display student details
    void display() {
        System.out.println("RollNo: " + rollno + " Name: " + name + " Course: " + course + " Fee: " + fee);
    }

    public static void main(String args[]) {
        StudentDemo s1 = new StudentDemo(101, "Shashank", "B.Tech");
        StudentDemo s2 = new StudentDemo(102, "Sunil", "B.Tech", 10000);

        s1.display();
        s2.display();
    }
}
