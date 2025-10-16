// Changing type of argument to achieve overloading 
// when we modified signature overloading is possible

class OverLoadDemo1 {

    void show(int id) {
        System.out.println("Welcome To Overloading");
	return 0;
    }

    void show(int id) {
        System.out.println("Welcome To Overloading");
	return null;
    }

    public static void main(String args[]) {
        OverLoadDemo2 d1 = new OverLoadDemo2();
        d1.show(10);         // Calls show(int)
        d1.show("Ram");      // Calls show(String)
    }
}
