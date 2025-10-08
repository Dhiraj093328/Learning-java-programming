class ConMethod {
    
    // Default constructor
    public ConMethod()
	{
        	System.out.println("Default Constructor");
    	}

    // Parameterized constructor
    public ConMethod(int id) {
        this(); // Calls the default constructor
        System.out.println("Parameterized Constructor " + id);
    }
}

class TestConstructor {
    public static void main(String args[]) {
        ConMethod m1 = new ConMethod(10);
    }
}
