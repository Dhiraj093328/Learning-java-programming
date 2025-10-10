class StaticDemo {

    static int a = 50;           // Static variable
    final static int b = 50;     // Final static variable (constant)

    public static void main(String args[]) {
        System.out.println(a);   // Prints value of a
        System.out.println(b);   // Prints value of b

	a=50;
	//b=100;

        System.out.println(a);   // Prints value of a
        System.out.println(b);   // Prints value of b

    }
}
