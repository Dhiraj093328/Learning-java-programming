Class D
{
	int id=100;
}

class E
{
	String name="Vrushabs";

}

Class F extends D
{
	String city="Pune";
	void display()
	{
		System.out.println("Id:"+id+"Name: "+name+" City:"+city);
	}
	public static void main(String args[])
	{
		F f1=new f();
		f1.display();
	}
}
