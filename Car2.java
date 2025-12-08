class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car2 extends Vehicle {

    void drive() {
        System.out.println("Car is driving...");
    }

    public static void main(String[] args) {
        Car2 c1 = new Car2();  
        c1.start();          
        c1.drive();  
    }
}
