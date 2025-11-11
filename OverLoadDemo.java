//Method overloading in polymorphism
//Using the same class mjultiple time is called as method overloading
// 2-ways to achieve or possible overloading :
//	1)changing no of arguments 
//	2) Changing type of argument

class OverLoadDemo{

	void show()
	{
		System.out.println("Welcome to ovrerloading");
	}
	void show(String name)
	{
		System.out.println(name+" Welcome to over loading");
	}


	void show(String name, String city)
	{
		System.out.println(name+" Welcome to over loading from " +city);
	}


	public static void main(String args[])
	{
		OverLoadDemo d1 = new OverLoadDemo();
		d1.show();
		d1.show("Ram");
		d1.show("Ram","Mumbai");
	}

}