class StringIndexDemo {
    public static void main(String args[]) {

        String str = "Hello"; // a sample string

        System.out.println("Welcome to exception handling");

        try {
            char ch = str.charAt(10);
            System.out.println(ch);

        } catch (Exception e) {
            System.out.println(e); // prints the actual exception
        }

        System.out.println("Rest of the code of my program");
    }
}
