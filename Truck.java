class Truck {
    int speed;

    // Instance initializer block
    {
        speed = 50;
        System.out.println("Instance initializer block executed...");
    }

    // Constructor
    public Truck() {
        System.out.println("Speed of truck is: " + speed);
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Truck t1 = new Truck();
        Truck t2 = new Truck();
    }
}
