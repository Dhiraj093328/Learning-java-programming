// Shift operators --> [(Right shift = >>), (Left shift = <<)]

class Shift_operators {

    public static void main(String[] args) {

        int no1 = 10; // Binary: 0000 1010

        System.out.println("Right shift by 1 of 10 : " + (no1 >> 1));
        System.out.println("Right shift by 2 of 10 : " + (no1 >> 2));
        System.out.println("Left shift by 1 of 10 : " + (no1 << 1));
        System.out.println("Left shift by 2 of 10 : " + (no1 << 2));
    }
}

// OUTPUT

// Right shift by 1 of 10 : 5
// Right shift by 2 of 10 : 2
// Left shift by 1 of 10 : 20
// Left shift by 2 of 10 : 40