class Result {

    public static void main(String[] args) {

        int marks = 90;

        if (marks >= 90) {
            System.out.println("Distinction");
        } else if (marks >= 75) {
            System.out.println("First Class");
        } else if (marks >= 60) {
            System.out.println("Second Class");
        } else if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println("Rest of the code.....");

    }

}
