
class Parent {
    String message = "Happy Diwali";

	void eat()
	{
		System.out.println("I am eating Diwali sweets ");
	}
}

class SuperDemo3 extends Parent {

	String message="Everyone";

	void eat()
	{
		super.eat();  //for acess parent & child both class

		System.out.println("I like homemade sweets ");
	}


	void showMessage()
	{
		System.out.println(super.message);
		System.out.println(message);
	}
    public static void main(String[] args) {
        SuperDemo3 d1 = new SuperDemo3();
	d1.showMessage();
	d1.eat();
    }
}