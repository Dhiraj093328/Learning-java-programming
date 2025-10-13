class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

void eat()
	{
		System.out.println(name+" eating a pedegree");
	}


    public static void main(String[] args) {
        Dog d1 = new Dog("Dog");
        d1.eat();
        d1.makesound();
    }
}
