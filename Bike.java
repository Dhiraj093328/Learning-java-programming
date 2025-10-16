// Method Overrriding in polymorphism (different class):
// -method name and signature will be same in overriding fror parent and child class
// -Method Overrriding can achieve in different class 



class Vehicle {
    public void run() {
        System.out.println("Hello from parent class method");
    }
}

class Bike extends Vehicle {
    public void run() {
        System.out.println("Hello from child class method");
    }

    public static void main(String[] args) {
        Bike v1 = new Bike();
        v1.run();
    }
}
