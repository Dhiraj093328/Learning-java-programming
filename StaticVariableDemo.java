class StaticVariableDemo {

    int emp_id;            // Instance variable
    String ename;          // Instance variable
    static String cname = "FCTP";  // Static variable (shared across instances)

    StaticVariableDemo(int emp_id, String ename) {
        this.emp_id = emp_id;
        this.ename = ename;
    }

    void show() {
        System.out.println("Emp ID: " + emp_id + ", Emp Name: " + ename + ", Company: " + cname);
    }

    public static void main(String[] args) {
        StaticVariableDemo d1 = new StaticVariableDemo(101, "Sunil");
        StaticVariableDemo d2 = new StaticVariableDemo(102, "Anil");

        d1.show();
        d2.show();
    }
}
