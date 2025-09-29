class Nestedifelse {

    public static void main(String[] args) {

        int age = 25;
        int weight = 40;

        if (age > 18) {
            if (weight >= 50) {
                System.out.println("Allowed to donate blood");
            } else {
                System.out.println("You are underweight, try next time");
            }
        } else {
            System.out.println("You are too young to donate blood");
        }

    }

}
