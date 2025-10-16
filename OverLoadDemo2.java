// Changing type of argument to achieve overloading 
// when we modified signature overloading is possible

class OverLoadDemo2 {

    void show(int id) {
        System.out.println("Welcome To Overloading");
    }

    void show(String id) {
        System.out.println("Welcome To Overloading");
    }

    public static void main(String args[]) {
        OverLoadDemo2 d1 = new OverLoadDemo2();
        d1.show(10);         // Calls show(int)
        d1.show("Ram");      // Calls show(String)
    }
}
