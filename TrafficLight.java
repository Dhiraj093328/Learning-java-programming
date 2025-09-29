class TrafficLight {

    public static void main(String[] args) {

        String color = "Yellow";  

        if (color.equals("Red")) {
            System.out.println("STOP");
        } else if (color.equals("Yellow")) {
            System.out.println("READY");
        } else if (color.equals("Green")) {
            System.out.println("GO");
        } else {
            System.out.println("Invalid colour");
        }
    }
}
