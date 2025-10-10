class StaticMethodDemo{

    int emp_id=101;            // Instance variable
    String ename="dhiraj";          // Instance variable

    StaticMethodDemo(int emp_id, String ename) {
        this.emp_id = emp_id;
        this.ename = ename;
    }
	static void change()
	{
		Cname="FCTS";
	}

    void show() {
        System.out.println("Emp ID: " + emp_id + ", Emp Name: " + ename + ", Company: " + cname);
    }

    public static void main(String args[]) {
        StaticMehodDemo d1 = new StaticMethodDemo(101, "Sunil");
        StaticMethodDemo d2 = new StaticMethodDemo(102, "Anil");
	change()

        d1.show();
        d2.show();
    }
}
