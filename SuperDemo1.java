
class Parent {
    String message = "Happy Diwali";
}

class SuperDemo1 extends Parent {

	String message="Everyone";

	void showMessage()
	{
		System.out.println(super.message);
		System.out.println(message);
	}
    public static void main(String[] args) {
        SuperDemo1 d1 = new SuperDemo1();
	d1.showMessage();
    }
}