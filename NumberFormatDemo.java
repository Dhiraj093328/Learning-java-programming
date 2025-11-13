class NumberFormatDemo {
    public static void main(String args[]) {

        String s = "Dhiraj"; // String value must be in double quotes

        System.out.println("Welcome to exception handling");
        try {
            int no = Integer.parseInt(s); // This will cause NumberFormatException
            System.out.println(no);

        } catch (Exception e) {
            System.out.println(e); // Print actual exception, not the letter "e"
        }
        System.out.println("Rest of the code of my program");
    }
}
