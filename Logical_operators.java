// Logical operators -->[(AND = &&),(OR = ||),(NOT=!)]

class Logical_operators {

    public static void main(String[] args) {

        int no1 = 20;
        int no2 = 35;

        System.out.println(" Logical AND: " + ((no1 < no2) && (no1 < no2)));
        System.out.println("Logical OR: " + ((no1 < no2) || (no1 < no2)));
        System.out.println("Logical NOT: " + (!(no1 < no2)));

    }

}

// OUTPUT

// Logical AND: true
// Logical OR: true
// Logical NOT: false
