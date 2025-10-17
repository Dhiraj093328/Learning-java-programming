class Vehicle {
    int chesisNo;
    String vehicleType;

    public Vehicle(int chesisNo, String vehicleType) {
        this.chesisNo = chesisNo;
        this.vehicleType = vehicleType;
    }
}

class TwoWheeler extends Vehicle {
    String color;

    public TwoWheeler(int chesisNo, String vehicleType, String color) {
        super(chesisNo, vehicleType);
        this.color = color;
    }

    void show() {
        System.out.println(super.chesisNo + " " + super.vehicleType + " " + color);
    }

    public static void main(String[] args) {
        TwoWheeler t1 = new TwoWheeler(1001, "Bike", "Red");
        t1.show();
    }
}
