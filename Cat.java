class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

void makesound()
	{
		System.out.println(name+" Make a sound as Meow");
	}


    public static void main(String[] args) {
        Cat c1 = new Cat("Cat");
        c1.eat();
        c1.makesound();
    }
}
