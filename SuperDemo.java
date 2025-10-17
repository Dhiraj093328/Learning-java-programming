//Super Keyword :
//1.Access Parent Class Variable
//2.Access Parent Class Method
//3.Access Parent Class Constructor

class Parent {
    String message = "Happy Diwali";
}

class SuperDemo2 extends Parent {

	String message="Everyone";

	void showMessage()
	{
		System.out.println(super.message);
		System.out.println(message);
	}
    public static void main(String[] args) {
        SuperDemo d1 = new SuperDemo();
        System.out.println(d1.message);
    }
}
