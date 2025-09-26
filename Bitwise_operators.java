// Bitwise operators --> [(AND = &), (OR = |), (XOR = ^), (Complement = ~)]

class Bitwise_operators {

    public static void main(String[] args) {

        int no1 = 20; // Binary: 10100
        int no2 = 35; // Binary: 100011

        System.out.println("Bitwise AND (no1 & no2): " + (no1 & no2));
        System.out.println("Bitwise OR (no1 | no2): " + (no1 | no2));
        System.out.println("Bitwise XOR (no1 ^ no2): " + (no1 ^ no2));
        System.out.println("Bitwise Complement of no1 (~no1): " + (~no1));
    }
}

// OUTPUT

// Bitwise AND (no1 & no2): 0
// Bitwise OR (no1 | no2): 55
// Bitwise XOR (no1 ^ no2): 55
// Bitwise Complement of no1 (~no1): -21