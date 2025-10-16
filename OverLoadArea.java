//write a java program to calculate area of circle,square and rectangle //using method overloading

class OverLoadArea {

    // calculate area of a circle
    void show(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle: " + area);
    }

    // calculate area of a square
    void show(int side) {
        int area = side * side;
        System.out.println("Area of square: " + area);
    }

    //calculate area of a rectangle
    void show(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }

    public static void main(String args[]) {
        OverLoadArea d1 = new OverLoadArea();
        d1.show(2.5);     
        d1.show(6);       
        d1.show(5, 3);
    }
}
