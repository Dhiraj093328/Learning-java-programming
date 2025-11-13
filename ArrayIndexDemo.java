class ArrayIndexDemo {
    public static void main(String args[]) {

        int[] arr = {1, 2, 3}; // an array of size 3

        System.out.println("Welcome to exception handling");

        try {
            // Trying to access index 5, which doesn't exist
            int value = arr[5];
            System.out.println(value);

        } catch (Exception e) {
            System.out.println(e); // prints the actual exception
        }

        System.out.println("Rest of the code of my program");
    }
}
