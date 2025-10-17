
class Parent {
    String message = "Happy Diwali";

	void eat()
	{
		System.out.println("I eating Diwali sweets ");
	}
}

class SuperDemo2 extends Parent {

	String message="Everyone";

	void showMessage()
	{
		System.out.println(super.message);
		System.out.println(message);
		super.eat();
	}
    public static void main(String[] args) {
        SuperDemo2 d1 = new SuperDemo2();
	d1.showMessage();
    }
}