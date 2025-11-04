//1)Write a java program to sum of first 10 natural no s using array and dynamic input using command line

class Sum {
    public static void main(String args[]) {
        int a[] = new int[10];
        int sum = 0;

        System.out.println("My command line array data:\n");

        // Store command line arguments in array
        for (int i = 0; i < 10; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        // Print array elements and calculate sum
        for (int j : a) {
            System.out.println(j);
            sum += j;
        }

        System.out.println("\nSum of first 10 natural numbers = " + sum);
    }
}
