class Bilunit {

    public static void main(String[] args) {

        int bilunit = 210;  

        if (bilunit<=100) {
            System.out.println("Low usage ");
        } else if ((bilunit>100)&& (bilunit<=300)) {
            System.out.println("Medium usage");
        } else if (bilunit>300) {
            System.out.println("High usage ");
        } else {
            System.out.println("Invalid bilunit");
        }
    }
}
