class SwitchCase {

    public static void main(String[] args) {

        int ch;

        System.out.println("1. Cricket");
        System.out.println("2. Football");
        System.out.println("3. Rugby");
        System.out.println("4. Polo");
        System.out.println("5. Kabaddi");
        System.out.println("");
        System.out.println("");



        // Enter Your Choice
        ch = 3;

        switch (ch) {
            case 1:
                System.out.println("My Favourite sport is Cricket");
                break;

            case 2:
                System.out.println("My Favourite sport is Football");
                break;

            case 3:
                System.out.println("My Favourite sport is Rugby");
                break;

            case 4:
                System.out.println("My Favourite sport is Polo");
                break;

            case 5:
                System.out.println("My Favourite sport is Kabaddi");
                break;

            default:
                System.out.println("Invalid Sport");
                break;
        }
    }
}
