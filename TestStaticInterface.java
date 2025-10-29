// Example of default and static methods in an interface

interface Drawable {
    void draw(); 
    // static method in interface
    static int cube(int x) 
	{
        	return x*x*x;
    	}

    // default method in interface
    default void display() {
        System.out.println("Default method in interface");
    }
}

class Rectangle implements Drawable 
{
 public void draw()
{
        System.out.println("Drawing Rectangle");
    }
}

public class TestStaticInterface 
{
    public static void main(String[] args) 
	{
       		Drawable d1 = new Rectangle();
        	d1.draw();                          // Calls overridden method
        	System.out.println(Drawable.cube(5)); // Calls static method from interface
       		 d1.display();                       // Calls default method from interface
    }
}
