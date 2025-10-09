class Sample {
    int id;
    String name;

    // Constructor
    public Sample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Display method using passed object
    void display(Sample obj) {
        System.out.println("Display Method Executed");
        System.out.println("Id: " + obj.id + " Name: " + obj.name);
    }

    // Show method
    void show() {
        System.out.println("Show method Executed");
        display(this); // passing current object
    }

    // Info method
    void info() {
        System.out.println("Info method Executed");
        display(this); // passing current object
    }

    // Main method
    public static void main(String[] args) {
        Sample s1 = new Sample(101, "Rahul");
        s1.show();

        Sample s2 = new Sample(102, "Sarika");
        s2.info();
    }
}
