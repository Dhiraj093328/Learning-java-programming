class StaticMethodDemo {

    int emp_id;
    String ename;
    static String cname = "FCTP";  // Static variable (shared by all)

    StaticMethodDemo(int emp_id, String ename) {
        this.emp_id = emp_id;
        this.ename = ename;
    }

    static void change() {
        cname = "FCTS";  // Static method can change static variable
    }

    void show() {
        System.out.println("Emp ID: " + emp_id + ", Emp Name: " + ename + ", Company: " + cname);
    }

    public static void main(String args[]) {
        StaticMethodDemo d1 = new StaticMethodDemo(101, "Sunil");
        StaticMethodDemo d2 = new StaticMethodDemo(102, "Anil");

        change();  // Static method call

        d1.show();
        d2.show();
    }
}
